package com.healthcare.patient_monitoring_system.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;

@Service
public class KafkaConsumerService {

    private Schema schema;

    public KafkaConsumerService() {
        try {
            // Load Avro schema from the .avsc file
            InputStream schemaStream = getClass().getClassLoader().getResourceAsStream("patient_event.avsc");
            schema = new Schema.Parser().parse(schemaStream);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load Avro schema: " + e.getMessage());
        }
    }

    @KafkaListener(topics = "patient-events", groupId = "patient-group")
    public void consumePatientEvent(ConsumerRecord<String, byte[]> record) {
        try {
            GenericRecord avroRecord = deserializeAvro(record.value());
            System.out.println("Received Avro message: " + avroRecord);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to deserialize Avro message: " + e.getMessage());
        }
    }

    private GenericRecord deserializeAvro(byte[] avroData) throws IOException {
        InputStream input = new ByteArrayInputStream(avroData);
        Decoder decoder = DecoderFactory.get().binaryDecoder(input, null);
        GenericDatumReader<GenericRecord> reader = new GenericDatumReader<>(schema);
        return reader.read(null, decoder);
    }
}

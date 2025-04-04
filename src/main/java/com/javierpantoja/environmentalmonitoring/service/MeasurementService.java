package com.javierpantoja.environmentalmonitoring.service;

import com.javierpantoja.environmentalmonitoring.model.Measurement;
import com.javierpantoja.environmentalmonitoring.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeasurementService implements IMeasurementService {

    private final MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Override
    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    @Override
    public Optional<Measurement> getMeasurementById(Long id) {
        return measurementRepository.findById(id);
    }

    @Override
    public Measurement saveMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    @Override
    public void deleteMeasurement(Long id) {
        measurementRepository.deleteById(id);
    }
}

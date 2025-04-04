package com.javierpantoja.environmentalmonitoring.service;

import com.javierpantoja.environmentalmonitoring.model.Measurement;

import java.util.List;
import java.util.Optional;

public interface IMeasurementService {
    List<Measurement> getAllMeasurements();
    Optional<Measurement> getMeasurementById(Long id);
    Measurement saveMeasurement(Measurement measurement);
    void deleteMeasurement(Long id);
}
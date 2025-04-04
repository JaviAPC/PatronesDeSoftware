package com.javierpantoja.environmentalmonitoring.controller;

import com.javierpantoja.environmentalmonitoring.model.Measurement;
import com.javierpantoja.environmentalmonitoring.service.MeasurementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/measurements")
@CrossOrigin("*") 
public class MeasurementController {

    private final MeasurementService measurementService;

    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping
    public List<Measurement> getAllMeasurements() {
        return measurementService.getAllMeasurements();
    }

    @GetMapping("/{id}")
    public Optional<Measurement> getMeasurementById(@PathVariable Long id) {
        return measurementService.getMeasurementById(id);
    }

    @PostMapping
    public Measurement saveMeasurement(@RequestBody Measurement measurement) {
        return measurementService.saveMeasurement(measurement);
    }

    @DeleteMapping("/{id}")
    public void deleteMeasurement(@PathVariable Long id) {
        measurementService.deleteMeasurement(id);
    }
}

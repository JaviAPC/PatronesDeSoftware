package com.javierpantoja.environmentalmonitoring.repository;

import com.javierpantoja.environmentalmonitoring.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}

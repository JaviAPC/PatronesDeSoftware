package com.javierpantoja.environmentalmonitoring.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "measurements")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double airPollutionLevel;
    private Double noiseLevel;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;

    public Measurement() {}

    public Measurement(Long id, Double airPollutionLevel, Double noiseLevel, LocalDateTime timestamp, Area area) {
        this.id = id;
        this.airPollutionLevel = airPollutionLevel;
        this.noiseLevel = noiseLevel;
        this.timestamp = timestamp;
        this.area = area;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getAirPollutionLevel() { return airPollutionLevel; }
    public void setAirPollutionLevel(Double airPollutionLevel) { this.airPollutionLevel = airPollutionLevel; }

    public Double getNoiseLevel() { return noiseLevel; }
    public void setNoiseLevel(Double noiseLevel) { this.noiseLevel = noiseLevel; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public Area getArea() { return area; }
    public void setArea(Area area) { this.area = area; }
}

public SensorReading submitReading(Long sensorId, SensorReading r) {
    Sensor s = sensorRepo.findById(sensorId)
        .orElseThrow(() -> new RuntimeException("Sensor not found"));
    if (r.getReadingValue() == null)
        throw new IllegalArgumentException("readingvalue");
    r.setSensor(s);
    r.setStatus("PENDING");
    return repo.save(r);
}

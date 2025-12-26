public Sensor createSensor(Long locId, Sensor s) {
    Location loc = locRepo.findById(locId)
        .orElseThrow(() -> new RuntimeException("Location not found"));
    if (s.getSensorType() == null)
        throw new IllegalArgumentException("sensorType");
    s.setLocation(loc);
    return repo.save(s);
}

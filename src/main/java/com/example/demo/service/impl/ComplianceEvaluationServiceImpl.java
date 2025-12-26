public ComplianceLog evaluateReading(Long id) {
    SensorReading r = readingRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Reading not found"));

    List<ComplianceLog> existing = logRepo.findBySensorReading_Id(id);
    if (!existing.isEmpty()) return existing.get(0);

    ComplianceThreshold t = thresholdRepo.findBySensorType(r.getSensor().getSensorType())
        .orElseThrow(() -> new RuntimeException("Threshold not found"));

    ComplianceLog log = new ComplianceLog();
    log.setSensorReading(r);
    log.setThresholdUsed(t);
    log.setStatusAssigned(
        (r.getReadingValue() >= t.getMinValue() && r.getReadingValue() <= t.getMaxValue())
        ? "SAFE" : "UNSAFE"
    );
    return logRepo.save(log);
}

public interface SensorReadingRepository extends JpaRepository<SensorReading, Long> {
    List<SensorReading> findBySensor_Id(Long id);
    List<SensorReading> findBySensor_IdAndReadingTimeBetween(Long id, LocalDateTime s, LocalDateTime e);
}

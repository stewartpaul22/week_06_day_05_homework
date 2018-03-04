public enum RoomType {

    SINGLE(1, 45.00, 0.00),
    DOUBLE(2, 65.00, 0.00),
    TWIN(2, 65.00, 0.00),
    FAMILY(4, 80.00, 0.00),
    CONFERENCE_LARGE(100, 0.00, 400.00),
    CONFERENCE_SMALL(70, 0.00, 300.00),
    DINING_LARGE(50, 0.00, 0.00),
    DINING_SMALL(25, 0.00, 0.00);

    private final int capacity;
    private final double nightlyRate;
    private final double hourlyRate;

    RoomType(int capacity, double nightlyRate, double hourlyRate) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
        this.hourlyRate = hourlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

}

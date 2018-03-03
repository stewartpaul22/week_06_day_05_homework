public enum RoomType {

    SINGLE(1, 45.00),
    DOUBLE(2, 65.00),
    TWIN(2, 65.00),
    FAMILY(4, 80.00),
    CONFERENCE_LARGE(100, 0.00),
    CONFERENCE_SMALL(70, 0.00),
    DINING_LARGE(50, 0.00),
    DINING_SMALL(25, 0.00);

    private final int capacity;
    private final double nightlyRate;

    RoomType(int capacity, double nightlyRate) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

}

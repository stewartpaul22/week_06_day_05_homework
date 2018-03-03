public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    CONFERENCE_LARGE(100),
    CONFERENCE_SMALL(70),
    DINING_LARGE(50),
    DINING_SMALL(25);

    private int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}

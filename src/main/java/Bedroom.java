import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(ArrayList<Guest> guests, RoomType roomType, int roomNumber) {
        super(guests);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}

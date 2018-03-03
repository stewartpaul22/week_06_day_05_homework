import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;

    public Bedroom(ArrayList<Guest> guests, RoomType roomType) {
        super(guests);
        this.roomType = roomType;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    // ensure that room capacity cannot be exceeded

}

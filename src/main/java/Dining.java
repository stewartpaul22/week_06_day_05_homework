import java.util.ArrayList;

public class Dining extends Room {

    private RoomType roomType;
    private String roomName;

    public Dining(ArrayList<Guest> guests, RoomType roomType, String roomName) {
        super(guests);
        this.roomType = roomType;
        this.roomName = roomName;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    public String getRoomName() {
        return this.roomName;
    }
}

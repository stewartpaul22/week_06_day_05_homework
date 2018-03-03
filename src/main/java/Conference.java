import java.util.ArrayList;

public class Conference extends Room {

    private RoomType roomType;
    private String roomName;

    public Conference(ArrayList<Guest> guests, RoomType roomType, String roomName) {
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

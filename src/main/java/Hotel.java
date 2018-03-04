import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Dining> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<Conference> conferenceRooms, ArrayList<Dining> diningRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public void checkInGuest(Guest guest, Room room) {
        room.checkInGuest(guest);

    }

    public int getRoomGuestCount(Room room) {
        return room.getGuestCount();
    }

    public void checkOutGuest(Guest guest, Room room) {
        room.checkOutGuest(guest);
    }

    public ArrayList<Guest> getGuestList(Room room) {
        ArrayList<Guest> guests = room.getGuestList(room);
        return guests;
    }


    // hotel can check which guests, if any, are checked into a particular room

    // hotel can see a list of vacant bedrooms

    // hotel can check in guests to bedrooms for a number of nights




}

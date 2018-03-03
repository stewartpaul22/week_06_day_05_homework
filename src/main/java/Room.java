import java.util.ArrayList;

public class Room {

    private ArrayList<Guest> guests;

    public Room(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public Guest checkInGuest(Guest guest) {
        guests.add(guest);
        return guest;
    }

    public Guest checkOutGuest(Guest guest) {
        guests.remove(guest);
        return guest;
    }
}

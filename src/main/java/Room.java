import java.util.ArrayList;

public  abstract class Room {

    private ArrayList<Guest> guests;

    public Room(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public String checkInGuest(Guest guest) {
        if (this.getGuestCount() < this.getRoomType().getCapacity()) {
            guests.add(guest);
        } else {
            return "Room is full";
        }
        return "Guest checked in successfully";
    }

    public String checkOutGuest(Guest guest) {
        if (this.getGuestCount() > 0) {
            guests.remove(guest);
        } else {
            return "The room is empty of guests";
        }
        return "Guest checked out successfully";
    }

    public abstract RoomType getRoomType();

    public double getNightlyRate() {
        return this.getRoomType().getNightlyRate();
    }

    public double getHourlyRate() {
        return this.getRoomType().getHourlyRate();
    }

    public ArrayList<Guest> getGuestList(Room room) {
        ArrayList<Guest> roomList = new ArrayList<>();
        for (Guest guest : guests) {
            roomList.add(guest);
        }

        return roomList;
    }
}

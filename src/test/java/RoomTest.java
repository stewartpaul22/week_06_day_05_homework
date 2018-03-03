//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class RoomTest {
//
//    private Room room;
//    private Guest guest1;
//    private Guest guest2;
//    private ArrayList<Guest> guests;
//
//    @Before
//    public void before() {
//        guest1 = new Guest("Bob Carolgees");
//        guest2 = new Guest("Les Dennis");
//        guests = new ArrayList<>();
//        room = new Room(guests);
//    }
//
//    @Test
//    public void canAddGuest() {
//        room.checkInGuest(guest1);
//        assertEquals(1, room.getGuestCount());
//    }
//
//    @Test
//    public void canRemoveGuest() {
//        room.checkInGuest(guest1);
//        room.checkOutGuest(guest1);
//        assertEquals(0, room.getGuestCount());
//    }
//
//
//
//
//}

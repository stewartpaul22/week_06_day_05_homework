import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom doubleBedroom;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
        guest2 = new Guest("Les Dennis");
        guests = new ArrayList<>();
        doubleBedroom = new Bedroom(guests, RoomType.DOUBLE);
    }

    @Test
    public void canCheckInGuest() {
        doubleBedroom.checkInGuest(guest1);
        assertEquals(1, doubleBedroom.getGuestCount());
    }

    @Test
    public void canCheckOutGuest() {
        doubleBedroom.checkInGuest(guest1);
        doubleBedroom.checkOutGuest(guest1);
        assertEquals(0, doubleBedroom.getGuestCount());
    }

    @Test
    public void checkRoomHasType() {
        assertEquals(RoomType.DOUBLE, doubleBedroom.getRoomType());
    }

}

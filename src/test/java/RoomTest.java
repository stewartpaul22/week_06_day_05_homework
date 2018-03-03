import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Bedroom doubleBedroom;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
        guest2 = new Guest("Les Dennis");
        guests = new ArrayList<>();
        doubleBedroom = new Bedroom(guests, RoomType.DOUBLE, 101);
    }

    @Test
    public void canAddGuest() {
        doubleBedroom.checkInGuest(guest1);
        assertEquals(1, doubleBedroom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        doubleBedroom.checkInGuest(guest1);
        doubleBedroom.checkOutGuest(guest1);
        assertEquals(0, doubleBedroom.getGuestCount());
    }




}

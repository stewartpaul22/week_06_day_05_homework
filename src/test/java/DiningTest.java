import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    private Dining diningSmall;
    private Guest guest1;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
        guests = new ArrayList<>();
        diningSmall = new Dining(guests, RoomType.DINING_SMALL, "The Wee Kitchen");
    }

    @Test
    public void canCheckInGuest() {
        String result = diningSmall.checkInGuest(guest1);
        assertEquals(1, diningSmall.getGuestCount());
        assertEquals("Guest checked in successfully", result);
    }

    @Test
    public void cannotExceedRoomCapacity () {
        // check in 100 guests i.e. room capacity
        for (int i = 0; i < 100; i++) {
            diningSmall.checkInGuest(guest1);
        }
        // attempt to check in one more guest
        String result = diningSmall.checkInGuest(guest1);
        assertEquals(diningSmall.getRoomType().getCapacity(), diningSmall.getGuestCount());
        assertEquals("Room is full", result);
    }

    @Test
    public void cannotCheckOutEmptyRoom () {
        String result = diningSmall.checkOutGuest(guest1);
        assertEquals(0, diningSmall.getGuestCount());
        assertEquals("The room is empty of guests", result);
    }

    @Test
    public void canCheckOutGuest() {
        diningSmall.checkInGuest(guest1);
        String result = diningSmall.checkOutGuest(guest1);
        assertEquals(0, diningSmall.getGuestCount());
        assertEquals("Guest checked out successfully", result);
    }

    @Test
    public void checkRoomHasType() {
        assertEquals(RoomType.DINING_SMALL, diningSmall.getRoomType());
    }

    @Test
    public void hasRoomName() {
        assertEquals("The Wee Kitchen", diningSmall.getRoomName());
    }

    @Test
    public void hasHourlyRate() {
        assertEquals(0.00, diningSmall.getHourlyRate(), 0.01);
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(0.00, diningSmall.getNightlyRate(), 0.01);
    }

}

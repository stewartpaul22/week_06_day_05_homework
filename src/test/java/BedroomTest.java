import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom doubleBedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
        guest2 = new Guest("Les Dennis");
        guest3 = new Guest("Cathy Newman");
        guests = new ArrayList<>();
        doubleBedroom = new Bedroom(guests, RoomType.DOUBLE, 101);
    }

    @Test
    public void canCheckInGuest() {
        String result = doubleBedroom.checkInGuest(guest1);
        assertEquals(1, doubleBedroom.getGuestCount());
        assertEquals("Guest checked in successfully", result);
    }

    @Test
    public void cannotExceedRoomCapacity () {
        String result1 = doubleBedroom.checkInGuest(guest1);
        String result2 = doubleBedroom.checkInGuest(guest2);
        String result3 = doubleBedroom.checkInGuest(guest3);
        assertEquals(doubleBedroom.getRoomType().getCapacity(), doubleBedroom.getGuestCount());
        assertEquals("Guest checked in successfully", result1);
        assertEquals("Guest checked in successfully", result2);
        assertEquals("Room is full", result3);
    }

    @Test
    public void cannotCheckOutEmptyRoom () {
        String result = doubleBedroom.checkOutGuest(guest1);
        assertEquals(0, doubleBedroom.getGuestCount());
        assertEquals("The room is empty of guests", result);
    }

    @Test
    public void canCheckOutGuest() {
        doubleBedroom.checkInGuest(guest1);
        String result = doubleBedroom.checkOutGuest(guest1);
        assertEquals(0, doubleBedroom.getGuestCount());
        assertEquals("Guest checked out successfully", result);
    }

    @Test
    public void checkRoomHasType() {
        assertEquals(RoomType.DOUBLE, doubleBedroom.getRoomType());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(101, doubleBedroom.getRoomNumber());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(65.00, doubleBedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void hasHourlyRate() {
        assertEquals(0.00, doubleBedroom.getHourlyRate(), 0.01);
    }

}

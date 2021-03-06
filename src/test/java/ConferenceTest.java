import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conferenceLarge;
    private Guest guest1;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
        guests = new ArrayList<>();
        conferenceLarge = new Conference(guests, RoomType.CONFERENCE_LARGE, "The Big Hall");
    }

    @Test
    public void canCheckInGuest() {
        String result = conferenceLarge.checkInGuest(guest1);
        assertEquals(1, conferenceLarge.getGuestCount());
        assertEquals("Guest checked in successfully", result);
    }

    @Test
    public void cannotExceedRoomCapacity () {
        // check in 100 guests i.e. room capacity
        for (int i = 0; i < 100; i++) {
            conferenceLarge.checkInGuest(guest1);
        }
        // attempt to check in one more guest
        String result = conferenceLarge.checkInGuest(guest1);
        assertEquals(conferenceLarge.getRoomType().getCapacity(), conferenceLarge.getGuestCount());
        assertEquals("Room is full", result);
    }

    @Test
    public void cannotCheckOutEmptyRoom () {
        String result = conferenceLarge.checkOutGuest(guest1);
        assertEquals(0, conferenceLarge.getGuestCount());
        assertEquals("The room is empty of guests", result);
    }

    @Test
    public void canCheckOutGuest() {
        conferenceLarge.checkInGuest(guest1);
        String result = conferenceLarge.checkOutGuest(guest1);
        assertEquals(0, conferenceLarge.getGuestCount());
        assertEquals("Guest checked out successfully", result);
    }

    @Test
    public void checkRoomHasType() {
        assertEquals(RoomType.CONFERENCE_LARGE, conferenceLarge.getRoomType());
    }

    @Test
    public void hasRoomName() {
        assertEquals("The Big Hall", conferenceLarge.getRoomName());
    }

    @Test
    public void hasHourlyRate() {
        assertEquals(400.00, conferenceLarge.getHourlyRate(), 0.01);
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(0.00, conferenceLarge.getNightlyRate(), 0.01);
    }

}

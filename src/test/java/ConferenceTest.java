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
        conferenceLarge.checkInGuest(guest1);
        assertEquals(1, conferenceLarge.getGuestCount());
    }

    @Test
    public void cannotExceedRoomCapacity () {
        for (int i = 0; i < 101; i++) {
            conferenceLarge.checkInGuest(guest1);
        }
        assertEquals(conferenceLarge.getRoomType().getCapacity(), conferenceLarge.getGuestCount());
    }

    @Test
    public void cannotCheckOutEmptyRoom () {
        conferenceLarge.checkOutGuest(guest1);
        assertEquals(0, conferenceLarge.getGuestCount());
    }

    @Test
    public void canCheckOutGuest() {
        conferenceLarge.checkInGuest(guest1);
        conferenceLarge.checkOutGuest(guest1);
        assertEquals(0, conferenceLarge.getGuestCount());
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
    public void hasNightlyRate() {
        assertEquals(0.00, conferenceLarge.getNightlyRate(), 0.01);
    }

}

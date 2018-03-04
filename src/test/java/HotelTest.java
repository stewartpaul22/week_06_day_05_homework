import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom doubleRoom;
    private Bedroom singleRoom;
    private Conference conferenceLarge;
    private Conference conferenceSmall;
    private Dining diningLarge;
    private Dining diningSmall;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Dining> diningRooms;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before() {
        guest1 = new Guest("Jim Morrison");
        guest2 = new Guest("Bob Dylan");
        guests = new ArrayList<>();
        doubleRoom = new Bedroom(guests, RoomType.DOUBLE, 101);
        singleRoom = new Bedroom(guests, RoomType.SINGLE, 103);
        conferenceLarge = new Conference(guests, RoomType.CONFERENCE_LARGE, "The Big Hall");
        conferenceSmall = new Conference(guests, RoomType.CONFERENCE_SMALL, "The Wee Hall");
        diningLarge = new Dining(guests, RoomType.DINING_LARGE, "The Kitchen");
        diningSmall = new Dining(guests, RoomType.DINING_SMALL, "The Cupboard");
        bedrooms = new ArrayList<>();
        conferenceRooms =  new ArrayList<>();
        diningRooms = new ArrayList<>();
        bedrooms.add(doubleRoom);
        bedrooms.add(singleRoom);
        conferenceRooms.add(conferenceLarge);
        conferenceRooms.add(conferenceSmall);
        diningRooms.add(diningLarge);
        diningRooms.add(diningSmall);
        hotel = new Hotel("Hotel Chelsea", bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void canCheckGuestIntoDoubleBedroom() {
        hotel.checkInGuest(guest1, doubleRoom);
        assertEquals(1, hotel.getRoomGuestCount(doubleRoom));
        //assertEquals("Jim Morrison", hotel.getGuestName(doubleRoom));
    }

    // test that room capacity cannot be exceeded

    // test that guest count cannot be made negative by attempting to remove guest

    // test that guest can be checked out of room

    // test that a guests name can be retrieved from a given room using room number

    // test that returns a list of vacant rooms i.e. where room count == 0

    // test that guest can be checked in for a number of nights

}

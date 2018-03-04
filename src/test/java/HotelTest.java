import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
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
        guest2 = new Guest("Jimi Hendrix");
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
    }

    @Test
    public void cannnotExceedRoomCapacity() {
        hotel.checkInGuest(guest1, singleRoom);
        hotel.checkInGuest(guest2, singleRoom);
        assertEquals(1, singleRoom.getGuestCount());
    }

    @Test
    public void cannotCheckOutEmptyRoomj() {
        hotel.checkOutGuest(guest1, doubleRoom);
        assertEquals(0, doubleRoom.getGuestCount());
    }

    @Test
    public void canCheckGuestOutDoubleBedroom() {
        hotel.checkInGuest(guest1, doubleRoom);
        hotel.checkInGuest(guest2, doubleRoom);
        hotel.checkOutGuest(guest1, doubleRoom);
        hotel.checkOutGuest(guest2, doubleRoom);
        assertEquals(0, doubleRoom.getGuestCount());
    }

    @Test
    public void canGetGuestListForRoom__hasGuests() {
        hotel.checkInGuest(guest1, doubleRoom);
        hotel.checkInGuest(guest2, doubleRoom);
        ArrayList<Guest> testList = new ArrayList<>();
        testList.add(guest1);
        testList.add(guest2);
        ArrayList<Guest> guestList = hotel.getGuestList(doubleRoom);
        assertEquals(testList, guestList);
    }

    @Test
    public void canGetGuestListForRoom__noGuests() {
        ArrayList<Guest> testList = new ArrayList<>();
        ArrayList<Guest> guestList = hotel.getGuestList(doubleRoom);
        assertEquals(testList, guestList);
    }

    @Test
    public void canGetListOfVacantRooms__allVacant() {
        ArrayList<Bedroom> vacantRooms = hotel.getVacantRooms();
        assertEquals(bedrooms, vacantRooms);
    }

    // test that guest can be checked in for a number of nights

}

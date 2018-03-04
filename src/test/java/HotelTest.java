import org.junit.Before;

import java.util.ArrayList;

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

    @Before
    public void before() {
        hotel = new Hotel("Hotel Chelsea", bedrooms, conferenceRooms, diningRooms);
        bedrooms.add(doubleRoom);
        bedrooms.add(singleRoom);
        conferenceRooms.add(conferenceLarge);
        conferenceRooms.add(conferenceSmall);
        diningRooms.add(diningLarge);
        diningRooms.add(diningSmall);
    }


}

import HotelCalifornia.Guest;
import HotelCalifornia.Hotel;
import HotelCalifornia.Room;
import HotelCalifornia.RoomType.Bed;
import HotelCalifornia.RoomType.Bedroom;
import HotelCalifornia.RoomType.Conferenceroom;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Room room;
    Bedroom bedroom;
    Conferenceroom conferenceroom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Conferenceroom> conferencerooms;
    ArrayList<Guest> guests;
    Guest guest6;

    @Before
    public void before(){
        guests = new ArrayList<>();
        guest6 = new Guest("Monica");
        bedroom = new Bedroom("Bedroom", guests, Bed.Single );
        conferenceroom = new Conferenceroom("Conference", guests, "Tatanga");
        bedrooms = new ArrayList<Bedroom>();
//        bedrooms.add(bedroom);
        conferencerooms = new ArrayList<Conferenceroom>();
//        conferencerooms.add(conferenceroom);
        hotel = new Hotel("Hotel California", bedrooms, conferencerooms);
    }

    @Test
    public void canGetConfRoom(){
        assertEquals(Arrays.asList(conferenceroom), hotel.getConferencerooms());
    }
//
//    @Test
//    public void getBedRooms(){
//        assertEquals(Arrays.asList(bedroom), hotel.getConferencerooms());
//    }

    @Test
    public void canAddBedRoom() {
        hotel.addBedroom(bedroom);
//        assertEquals(Arrays.asList(bedroom), hotel.getBedrooms());
        assertEquals(1, hotel.countBedRoom());
    }

    @Test
    public void canAddConfRoom() {
        hotel.addConferenceRoom(conferenceroom);
//        assertEquals(Arrays.asList(conferenceroom), hotel.getConferencerooms());
        assertEquals(1, hotel.countConferenceRoom());

    }

}

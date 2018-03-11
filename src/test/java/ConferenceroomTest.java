import HotelCalifornia.Guest;
import HotelCalifornia.Room;
import HotelCalifornia.RoomType.Conferenceroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ConferenceroomTest {
    Room room;
    Conferenceroom conferenceroom;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    ArrayList<Guest> guests;


    @Before
    public void before(){
        guests = new ArrayList<>();
        guest3 = new Guest("Tony");
        guest4 = new Guest("Ann");
        guest5 = new Guest("Gillian");
        conferenceroom= new Conferenceroom("Conference",guests, "Canaima");
    }


    @Test
    public void getConfRoomName(){
        assertEquals("Conference", conferenceroom.getRoomName());
    }

    @Test
    public void getGuestCount(){
        assertEquals(0, conferenceroom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceroom.addGuest(guest3);
        conferenceroom.addGuest(guest4);
        conferenceroom.addGuest(guest5);
        assertEquals(Arrays.asList(guest3,guest4,guest5), conferenceroom.getGuests());
        assertEquals(3, conferenceroom.getGuestCount());   /// ???????
    }

    @Test
    public void canRemoveGuest(){
        conferenceroom.addGuest(guest3);
        conferenceroom.removeGuest(guest3);
        assertEquals(0, conferenceroom.getGuestCount());

    }

}

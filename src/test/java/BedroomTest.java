import HotelCalifornia.Guest;
import HotelCalifornia.Room;
import HotelCalifornia.RoomType.Bed;
import HotelCalifornia.RoomType.Bedroom;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Room room;
    Bedroom bedroom;
    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;



    @Before
    public void before(){
        guests = new ArrayList<>();
        guest1 = new Guest("Maria");
//        guest2 = new Guest("Peter");
//        guests.add(guest1);
//        guests.add(guest2);
        bedroom = new Bedroom("Bedroom", guests, Bed.Single);
        bedroom1 = new Bedroom("Bedroom", guests,Bed.Double);

    }

    @Test
    public void getBedRoomCapacity(){
        assertEquals(1, bedroom.getBedCapacity());
    }

    @Test
    public void getBedRoomName(){
        assertEquals("Single", bedroom.getBedName());
    }

    @Test
    public void getBedRoomCapacity1(){
        assertEquals(2, bedroom1.getBedCapacity());
    }

    @Test
    public void getBedRoomName1(){
        assertEquals("Double", bedroom1.getBedName());
    }

    @Test
    public void getGuestCount(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void getRoomName(){
     assertEquals("Bedroom", bedroom.getRoomName());}

     @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(Arrays.asList(guest1), bedroom.getGuests());
        assertEquals(1, bedroom.getGuestCount());   /// ???????
     }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getGuestCount());

    }

}

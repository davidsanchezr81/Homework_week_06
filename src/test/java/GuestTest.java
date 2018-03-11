import HotelCalifornia.Guest;
import org.junit.Before;
import org.junit.Test;
import sun.security.util.Cache;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("John");
    }


    @Test
    public void getName(){
        assertEquals( "John", guest.getName());
    }

//    @Test
//    public void getBudget(){
//        assertEquals(250, guest.getBudget(), 0.01);
//    }

//    LISTO !!!
}

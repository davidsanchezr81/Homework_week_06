package HotelCalifornia.RoomType;

import HotelCalifornia.Guest;
import HotelCalifornia.Room;


import java.util.ArrayList;


public class Conferenceroom extends Room {

   private String confname;

   public Conferenceroom(String roomname, ArrayList<Guest> guests, String confname) {

       super(roomname, guests);
       this.confname = confname;
   }

   public String getConfName(){ return this.confname;}
}

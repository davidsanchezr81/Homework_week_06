package HotelCalifornia;

import java.util.ArrayList;

public abstract class Room {

    private String roomname;
    private ArrayList<Guest> guests;

    public Room(String roomname, ArrayList<Guest> guests){
        this.roomname = roomname;
        this.guests = new ArrayList<Guest>();
    }


    public String getRoomName(){return this.roomname;}

    public void addGuest(Guest guest){guests.add(guest);}

    public void removeGuest(Guest guest){guests.remove(guest);}

    public int getGuestCount(){return this.guests.size();}

    public ArrayList<Guest> getGuests() {return guests;}
}

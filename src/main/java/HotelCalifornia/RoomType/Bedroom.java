package HotelCalifornia.RoomType;

import HotelCalifornia.Guest;
import HotelCalifornia.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private Bed bed;



    public Bedroom(String roomname,  ArrayList<Guest> guests, Bed bed){

        super(roomname, guests);
        this.bed = bed;
    }


    public int getBedCapacity(){return this.bed.getCapacity();}

    public String getBedName(){return this.bed.getName();}






}


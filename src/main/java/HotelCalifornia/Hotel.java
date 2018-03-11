package HotelCalifornia;

import HotelCalifornia.RoomType.Bedroom;
import HotelCalifornia.RoomType.Conferenceroom;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conferenceroom> conferencerooms;


    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<Conferenceroom> conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferencerooms = conferencerooms;

    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<Conferenceroom> getConferencerooms() {
        return this.conferencerooms;
    }

    public void addBedroom(Bedroom bedroom){bedrooms.add(bedroom);

    }

    public void addConferenceRoom(Conferenceroom conferenceroom){conferencerooms.add(conferenceroom);

    }

    public int countConferenceRoom(){return this.conferencerooms.size();}

    public int countBedRoom(){return this.bedrooms.size();}

}
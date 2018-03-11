package HotelCalifornia.RoomType;

public enum Bed {
    Single("Single", 1),
    Double("Double", 2);

    private String name;
    private int capacity;

    Bed(String name, int capacity){

        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name;}

    public int getCapacity() { return capacity;}
}

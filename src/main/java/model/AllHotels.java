package model;
/**
 * This class gives a list of hotels
 * mainly for testing purposes.
 * @author agathe merceron
 */

import java.util.ArrayList;

public class AllHotels {

    public static ArrayList<Hotel> getDefaultList(){
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(Hotel.getDefaultHotel());
        //I am lazy; of course here create different hotels
        Hotel h = new Hotel("Holo", "Holstenstr.", "2", "asd", "Lübeck", "Unknown.jpeg");
        h.addRating(1, "asdasdasd");
        hotels.add(Hotel.getDefaultHotel());
        hotels.add(h);
        return hotels;

    }

    public static void main(String[] args) {
        ArrayList<Hotel> ibises = AllHotels.getDefaultList();
        System.out.println(ibises);
    }
}
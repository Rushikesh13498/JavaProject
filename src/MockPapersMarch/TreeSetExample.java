package MockPapersMarch;

import java.util.*;

class Train implements Comparable<Train> {
    private int id;
    private String name;
    private int totalSeats;

  
    public Train(int id, String name, int totalSeats) {
        this.id = id;
        this.name = name;
        this.totalSeats = totalSeats;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public int compareTo(Train other) {
        // Compare trains based on totalSeats
        return Integer.compare(this.totalSeats, other.totalSeats);
    }
}

public class TreeSetExample {
    public static void main(String[] args) {
     
        TreeSet<Train> trainSet = new TreeSet<>();

       
        trainSet.add(new Train(1, "rajdhani", 200));
        trainSet.add(new Train(2, "duranto", 150));
        trainSet.add(new Train(3, "tejas", 180));
        trainSet.add(new Train(4, "sachkhand", 250));
        trainSet.add(new Train(5, "tapovan", 220));

        for (Train train : trainSet) {
            System.out.println("Train ID: " + train.getId() +
                    ", Name: " + train.getName() +
                    ", Total Seats: " + train.getTotalSeats());
        }
    }
}

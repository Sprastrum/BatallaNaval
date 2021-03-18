package entities;

import java.util.ArrayList;

public class AircraftCarrier {
    private int numberId;
    private int capacity;
    private Position position;
    private ArrayList<Marine> marines = new ArrayList<>();

    public static int tripulants;
    public static final int POINTS = 0;

    public AircraftCarrier(int numberId, int capacity, Position position) {
        this.capacity = capacity;
        this.numberId = numberId;
        this.position = position;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMarines() {
        return marines.size();
    }

    public boolean addMarines(Marine m) {
        return marines.add(m);
    }

    public Position getPosition() {
        return position;
    }
}

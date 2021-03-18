package entities;

import entities.Marine;

import java.util.ArrayList;

public class Ship {
    private int Id;
    private Position position;
    private ArrayList<Marine> marines = new ArrayList<>();

    public static int tripulants;
    public static final int POINTS = 0;

    public Ship(int Id, Position position) {
        this.Id = Id;
        this.position = position;
    }

    public boolean addMarines(Marine m) {
        return marines.add(m);
    }

    public Position getPosition() {
        return position;
    }
}

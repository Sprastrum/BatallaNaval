package entities;

import java.util.ArrayList;

public class Aircraft {
    private String licencePlate;
    private boolean inAir;
    private boolean pilot;
    private boolean copilot;
    private Position position;
    private ArrayList<Marine> marines = new ArrayList<>();

    public static int tripulants;
    public static final int POINTS = 0;

    public Aircraft(String licence, boolean inAir, boolean pilot, boolean copilot, Position position) {
        if(pilot && copilot) {
            this.inAir = inAir;
        }
        else {
            this.inAir = false;
        }

        licencePlate = licence;
        this.copilot = copilot;
        this.position = position;
        this.pilot = pilot;
    }

    public boolean getPilot() {
        return pilot;
    }

    public boolean getInAir(boolean pilot) {
        if(pilot) {
            return true;
        }
        return false;
    }

    public boolean addMarines(Marine m) {
        return marines.add(m);
    }

    public int getMarinesSize() {
        return marines.size();
    }

    public String getLicencePlate() { return licencePlate; }

    public Position getPosition() {
        return position;
    }
}

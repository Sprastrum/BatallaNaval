import java.util.ArrayList;

public class Ship {
    private int numberId;
    private ArrayList<Marine> marines = new ArrayList<>();

    public static int tripulants;
    public static final int POINTS = 0;

    public Ship(int Id, Marine marines) {
        numberId = Id;
        this.marines.add(marines);
    }
}

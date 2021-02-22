import java.util.ArrayList;

public class Navy {
    public final int CODENAVY = 1;

    private String name;
    private Board board;
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();
    private ArrayList<AircraftCarrier> carriers = new ArrayList<>();
    private ArrayList<Ship> ships = new ArrayList<>();
    private ArrayList<Marine> marines = new ArrayList<>();

    public Navy(String name) {
        this.name = name;
    }

    public int Alias() {
        return board.getAlias();
    }

    public int disponibilidadEnPortaAviones() {
        int number = 0;
        int i = 0;

        for(i = 0; i < carriers.size(); i++) {
            number = number + carriers.get(i);
        }

        return number;
    }
}

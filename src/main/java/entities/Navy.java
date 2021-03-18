package entities;

import java.util.*;

public class Navy {
    private String name = "";
    private String code = "";
    private Board board = new Board();
    private ArrayList<Navy> enemies = new ArrayList<>();
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private ArrayList<Marine> marines = new ArrayList<Marine>();
    private ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
    private ArrayList<AircraftCarrier> carriers = new ArrayList<AircraftCarrier>();

    public Navy(String name, final String CODENAVY) {
        code = CODENAVY;
        this.name = name;
    }

    public int alias() { return board.getAlias()+1; }

    public String getName() { return name; }

    public String getCode() { return code; }

    public ArrayList<Navy> getEnemies() { return getEnemy(); }

    public ArrayList<Navy> getEnemy() { return enemies; }

    public boolean addAircraft(Aircraft a) { return aircrafts.add(a); }

    public boolean addAircraftCarrier(AircraftCarrier ac) { return carriers.add(ac); }

    public int disponibilidadEnPortaAviones() {
        int number = 0;
        int i = 0;

        for(i = 0; i < carriers.size(); i++) {
            number += carriers.get(i).getCapacity();
        }

        return number;
    }

    public ArrayList <String> enAire() {
        ArrayList<String> aircraftnames = new ArrayList<>();
        int i = 0, j = 0;

        for(i = 0; i < getEnemy().get(i).aircrafts.size(); i++) {
            for(j = 0; (j < getEnemy().get(i).aircrafts.size()); j++) {
                aircraftnames.add(getEnemy().get(i).aircrafts.get(j).getLicencePlate());
            }
        }

        return aircraftnames;
    }

    /*public boolean esBuenAtaque(int longitud, int latitud) {
        Position atackposition = new Position(longitud, latitud);
        boolean result = false;

        if((longitud <= Board.MAX_LONG) && (longitud >= Board.MIN_LONG) && (latitud <= Board.MAX_LAT) &&
                (latitud >= Board.MIN_LAT)) {
            for(int i = 0; (atackposition.equals(getEnemy().aircrafts.get(i).getPosition())) ||
                    (atackposition.equals(getEnemy().carriers.get(i).getPosition()))
                    || (atackposition.equals(getEnemy().ships.get(i).getPosition())); i++) {
                result = true;
            }
        }
        return result;
    }*/
}

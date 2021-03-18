package entities;

import java.sql.PreparedStatement;
import java.util.ArrayList;


public class Board {
    private ArrayList<Navy> navies = new ArrayList<Navy>();
    private ArrayList<Navy> enemies = new ArrayList<>();
    private String name;
    public static final int MIN_LAT = -100;
    public static final int MAX_LAT = 100;
    public static final int MIN_LONG = -100;
    public static final int MAX_LONG = 100;

    /**
     *
     *
     * @param n
     * @return Boolean
     */

    public boolean addNavy(Navy n) {
        boolean exist = false;
        int i = 0;

        for(i = 0; i < navies.size(); i++) {
            if(navies.get(i).getCode().equals(n.getCode())) {
                exist = true;
            }
        }
        if(!exist) {
            navies.add(n);
            getEnemy(n);

            for(i = 0; i < navies.size() - 1; i++) {
                setEnemy(navies.get(i));
            }
        }
        return !exist;
    }

    public int getNumNavys() { return navies.size(); }

    public int getAlias() {
        int number = 1;
        int i = 0;

        for (i = 0; i < navies.size() - 1; i++) {
            if(navies.get(i).getName().equals(navies.get(i+1).getName())) {
                number++;
            }
        }
        return number;
    }

    public ArrayList<Navy> getEnemy(Navy n) {
        int i = 0;

        for(i = 0; i < navies.size() - 1; i++) {
            this.enemies.add(navies.get(i));
        }
        setEnemy(n);

        return enemies;
    }

    public void setEnemy(Navy n) {
        int i = 0;

        for(i = 0; i < navies.size() - 1; i++) {
            if(!navies.get(i).getCode().equals(n.getCode())) {
                this.enemies.add(navies.get(i));
            }
        }
    }
}

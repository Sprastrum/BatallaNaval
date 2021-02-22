import java.util.ArrayList;


public class Board {
    private ArrayList<Navy> navies = new ArrayList<Navy>();
    public static final int MIN_LAT = -100;
    public static final int MAX_LAT = 100;
    public static final int MIN_LONG = -100;
    public static final int MAX_LONG = 100;


    public int getAlias() {
        int number = 0;
        int i = 0;
        int n = 0;

        for (i = 1; i < navies.size(); i++) {
            if(navies.get(n).equals(navies.get(i))) {
                number++;
                if(n < navies.size() && i == navies.size()) {
                    n++;
                    i = n + 1;
                }
            }
        }

        return number;
    }
}

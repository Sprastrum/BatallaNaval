public class Aircraft {
    private String licencePlate;
    private boolean inAir;
    private boolean pilot;
    private boolean copilot;

    public static int tripulants;
    public static final int POINTS = 0;

    public Aircraft(String licence, boolean state, boolean pilot, boolean copilot) {
        state = false;
        licencePlate = licence;
        this.pilot = pilot;

        if(this.pilot) {
            state = inAir;
        }

        this.copilot = copilot;
    }
}

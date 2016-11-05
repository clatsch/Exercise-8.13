public class Reifen {
    /** Reifendruck */
    private double druck;

    /** Konstruktor */
    public Reifen (double luftdruck) {
        druck = luftdruck;
    }

    /** Zugriffsfunktion fuer Reifendruck */
    public double aktuellerDruck() {
        return druck;
    }
}

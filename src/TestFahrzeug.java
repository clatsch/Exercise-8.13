
public class TestFahrzeug {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("Fahrrad", 2, 4.5);
        Fahrzeug f2 = new Fahrzeug("Auto", 4, 2.8);

        f1.fahrtLos();

        System.out.println("\nZussand 1:");
        f1.status();
        f2.status();

        f2.fahrtLos();

        System.out.println("\nZustand 2:");
        f1.status();
        f2.status();

        f1.halteAn();

        System.out.println("\nZustand 3:");
        f1.status();
        f2.status();

        f2.halteAn();

        System.out.println("\nZustand 4");
        f1.status();
        f2.status();
    }
}

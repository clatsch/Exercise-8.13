public class Fahrzeug {

    private String name;
    private int anzahlReifen;
    private Reifen reifenArt;
    private boolean faehrt;

    //Konstruktor

    public Fahrzeug (String name, int anzahlReifen, double druck) {
        this.name = name;
        this.anzahlReifen = anzahlReifen;
        reifenArt = new Reifen(druck);
        faehrt = false;
    }

    public void fahrtLos() {
        faehrt = true;
    }

    public void halteAn() {
        faehrt = false;
    }

    public void status() {
        System.out.print(name);
        if (faehrt)
            System.out.print(" faehrt ");
        else
            System.out.print(" steht ");
        System.out.print("auf " + anzahlReifen + " Reifen mit je ");
        System.out.println(reifenArt.aktuellerDruck() + " bar");

    }

}

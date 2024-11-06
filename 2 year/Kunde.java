public class Kunde {

    private double kontostand = 111.0;

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double neuerKontostand) {
        kontostand = neuerKontostand;
    }

    public static void main(String[] args) {
        
        Kunde kunde = new Kunde();

        System.out.println("Initialer Kontostand: " + kunde.getKontostand());

        kunde.setKontostand(250.0);

        System.out.println("Neuer Kontostand: " + kunde.getKontostand());
    }
}

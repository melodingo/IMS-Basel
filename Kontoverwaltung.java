import java.util.Scanner;

public class Kontoverwaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto("Samuel Richchman", 1000.0);
        char auswahl;

        do {
            System.out.println("*******Einfaches Konto*******");
            System.out.println("Aktueller Kontostand: " + konto.getKontostand());
            System.out.print("Kontostand (k), Einzahlen (e), Abheben (a), Beenden(b): ");
            auswahl = scanner.next().charAt(0);

            if (auswahl == 'e') {
                System.out.print("Betrag eingeben: ");
                double betrag = scanner.nextDouble();
                konto.einzahlen(betrag);
            } else if (auswahl == 'a') {
                System.out.print("Betrag eingeben: ");
                double betrag = scanner.nextDouble();
                konto.abheben(betrag);
            } else if (auswahl == 'k') {
                System.out.println("Kontostand: " + konto.getKontostand());
            } else if (auswahl == 'b') {
                System.out.println("Programm beendet.");
            } else {
                System.out.println("Ungültige Auswahl.");
            }
            System.out.println();
        } while (auswahl != 'b');

        scanner.close();
    }
}

class Konto {
    private String name;
    private double balance;

    public Konto(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            balance += betrag;
            System.out.println(betrag + " wurden eingezahlt.");
        } else {
            System.out.println("Ungültiger Betrag.");
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= balance) {
            balance -= betrag;
            System.out.println(betrag + " wurden abgehoben.");
        } else {
            System.out.println("Ungültiger Betrag oder unzureichender Kontostand.");
        }
    }

    public double getKontostand() {
        return balance;
    }
}

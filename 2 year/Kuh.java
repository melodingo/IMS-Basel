public class Kuh {

    private String name;
    private int gewicht;

    
    public Kuh() { 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void nameUndGewichtAusgeben() {
        System.out.println("Name: " + name + ", Gewicht: " + gewicht + " kg");
    }

    public static void main(String[] args) {
        Kuh kuh1 = new Kuh();
        Kuh kuh2 = new Kuh();

        kuh1.setName("Berta");
        kuh1.setGewicht(500);

        kuh2.setName("Elsa");
        kuh2.setGewicht(450);

        kuh1.nameUndGewichtAusgeben();
        kuh2.nameUndGewichtAusgeben();
    }
}

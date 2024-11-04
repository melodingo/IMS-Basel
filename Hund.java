public class Hund {

    private String name;
    public Hund(String name) {
        this.name = name;
    }

    public void bellen() {
        System.out.println(name + " bellt: Wuff! Wuff!");
    }

    public void essen() {
        System.out.println(name + " isst.");
    }

    public void katzeJagend() {
        System.out.println(name + " jagt eine Katze.");
        System.out.println("-------------------------");
    
    }
    public static void main(String[] args) {
        Hund[] hunde = new Hund[3];

        hunde[0] = new Hund("Chester");
        hunde[1] = new Hund("Rex");
        hunde[2] = new Hund("Luna");

        int index = 0;
        while (index < hunde.length) {
            hunde[index].bellen();
            hunde[index].essen();
            hunde[index].katzeJagend();
            index++;
        }
    }
}
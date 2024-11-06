public class Multip_tabelle {
    public static void main(String[] args) {
        for (int l = 1; l <= 10; l++) { //links
            for (int o = 1; o <= 10; o++) { //oben
                System.out.print(l * o + "\t"); // tabulator
            }
            System.out.println();
        }
    }
}

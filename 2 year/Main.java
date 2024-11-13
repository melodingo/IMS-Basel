public class Main {
    public static void main(String[] args) {
        Tier tier = new Hund();
        tier.geraeuschMachen();
        
        Tier tier2 = new Katze();
        tier2.geraeuschMachen();
    }
}

class Tier {
    public void geraeuschMachen() {
        System.out.println("Das Tier macht ein Geräusch");
    }
}

class Hund extends Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt: Wau Wau");
    }
}

class Katze extends Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Die Katze miaut: Miau Miau");
    }
}

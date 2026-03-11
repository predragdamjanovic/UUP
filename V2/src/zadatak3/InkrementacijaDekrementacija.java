package zadatak3;

public class InkrementacijaDekrementacija {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        // povecavamo vrednost x za 1
        x = x + 1;
        System.out.println("x+1 iznosi :" + x + " i to je nova vrednost broja x");
        // povecavamo x za jos jedan (inkrementacija)
        ++x;
        System.out.println("Sada x iznosi: " + x);
        // smanjujemo vrednost y za jedan
        y = y - 1;
        System.out.println("y-1 iznosi: " + y + " i to je nova vredost broja y");
        // smanjimo y za jos jedan (dekrementacija)
        --y;
        System.out.println("Sada y iznosi: " + y);

    }
}

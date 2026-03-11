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

        //pre i post inkrementacija
        int a = 3;
        int b = 2;
        int c = 1;

        System.out.println("Broj b iznosi: "+b);
        // post inkrementacija
        int d = a + b++;
        System.out.println("Vrednost broja d je: "+d);
        /* izlaz na ekranu je broj 5, razlog tome je jer su se prvo
        sabrali a i b pa b uvecao za 1
        */
        //Sada stampamo vrednost pod b
        System.out.println("Nova vrednost broja b je: "+b);
        // preinkrementacija
        int e = a + ++c;
        /*
        Sada je izlaz na ekranu 5 ,jer se prvo izvrsila inkrementacija pa su
        se brojevi sabrali
         */
        System.out.println("Vrednost broja e je : "+e);
    }
}

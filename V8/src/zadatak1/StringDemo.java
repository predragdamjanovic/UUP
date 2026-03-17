package zadatak1;

public class StringDemo {
    public static void main(String[] args) {

        // PRAVLJENJE I POREDJENJE STRING OBJEKATA
        String recenica1 = "Uvod u programiranje";
        String recenica2 = "Osnove informacionih tehnologija";
        String recenica3 = "Uvod u programiranje";
        String recenica4 = new String("Osnove informacionih tehnologija");

        System.out.println("RECENICE");
        System.out.println("1: " + recenica1);
        System.out.println("2: " + recenica2);
        System.out.println("3: " + recenica3);
        System.out.println("4: " + recenica4);
        System.out.println("\nPOREDJENJA");

        //DA
        if (recenica1 == recenica3) {
            System.out.println(recenica1 + " == " + recenica3 + ":\tDA (Reference na iste objekte");
        } else {
            System.out.println(recenica1 + " == " + recenica3 + ":\tNE (Reference na razlicite objekte");
        }

        //NE
        if (recenica2 == recenica4) {
            System.out.println(recenica2 + " == " + recenica4 + ":\tDA (Reference na iste objekte)");
        } else {
            System.out.println(recenica2 + " == " + recenica4 + ":\tNE (Reference na razlicite objekte)");
        }
        System.out.println();

        //Poredjenje String objekata po sadrzaju
        if (recenica1.equals(recenica3)) {
            System.out.println(recenica1 + " equals " + recenica3 + ":\tDA (Isti sadrzaji objekata)");
        } else {
            System.out.println(recenica1 + " equals " + recenica3 + ":\tNE (Razliciti sadrzaji objekata)");
        }
        if (recenica2.equals(recenica4)) {
            System.out.println(recenica2 + " equals " + recenica4 + ":\tDA (Isti sadrzaji objekata)");
        } else {
            System.out.println(recenica2 + " equals " + recenica4 + ":\tNE (Razliciti sadrzaji objekata)");
        }
        System.out.println();

        if (recenica1.equals("UVOD U PROGRAMIRANJE")) {
            System.out.println(recenica1 + " equals " + "UVOD U PROGRAMIRANJE" + ":\tDA (Isti sadrzaji objekata)");
        } else {
            System.out.println(recenica1 + " equals " + "UVOD U PROGRAMIRANJE" + ":\tNE (Razliciti sadrzaji objekata)");
        }
        if (recenica1.equalsIgnoreCase("UVOD U PROGRAMIRANJE")) {
            System.out.println(recenica1 + " equalsIgnoreCase " + "UVOD U PROGRAMIRANJE" + ":\tDA (Isti sadrzaji objekata)");
        } else {
            System.out.println(recenica1 + " equalsIgnoreCase " + "UVOD U PROGRAMIRANJE" + ":\tNE (Razliciti sadrzaji objekata)");
        }
        System.out.println();

        //Poredjenje String objekata po velicini
        if (recenica1.compareTo("UVOD U PROGRAMIRANJE") > 0) {
            System.out.println(recenica1 + " je veca od " + "\"UVOD U PROGRAMIRANJE\".");
        } else if (recenica1.compareTo(recenica2) < 0) {
            System.out.println(recenica1 + " je manja od " + "\"UVOD U PROGRAMIRANJE\".");
        } else {
            System.out.println("Recenice su iste");
        }
        if (recenica1.compareToIgnoreCase("UVOD U PROGRAMIRANJE") > 0) {
            System.out.println(recenica1 + " je veca od " + "\"UVOD U PROGRAMIRANJE\".");
        } else if (recenica1.compareTo(recenica2) < 0) {
            System.out.println(recenica1 + " je manja od " + "\"UVOD U PROGRAMIRANJE\".");
        } else {
            System.out.println("Recenice su iste");
        }
        System.out.println();

        /*OPERACIJE SA STRING OBJEKTIMA*/
        System.out.println("\nOperacije sa String objektima:\n");
        //sabiranje (konkatenacija)
        String recenica5 = recenica1 + "/" + recenica2;
        System.out.println(recenica5);

        //duzina
        System.out.println("\nDuzina recenice " + "\"" + recenica1 + "\"" + " je: " + recenica1.length() + "\n");

        //Provera pocetka i kraja sadrzaja
        System.out.println("Recenica za proveru pocetka sadrzaja: " + recenica1);
        if (recenica1.startsWith("Uvod")) {
            System.out.println("Provera pocetka je ispravna!");
        } else {
            System.out.println("Provera pocetka nije ispravna!");
        }
        if (recenica1.startsWith("u", 5)) {
            System.out.println("Provera pocetka na indeksnoj poziciji 5 je ispravna!");
        } else {
            System.out.println("Provera pocetka na indeksnoj poziciji 5 nije ispravna!");
        }
        System.out.println("\nRecenica za proveru kraja sadrzaja: " + recenica2);
        if (recenica2.endsWith("tehnologija")) {
            System.out.println("Provera kraja je ispravna!");
        } else {
            System.out.println("Provera kraja nije ispravna!");
        }
        System.out.println("\n");

        //Pravljenje niza znakova od String objekata (znakovnih nizova)
        char[] niz1 = recenica1.toCharArray();
        System.out.println("Niz znakova: | ");
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i] + " | ");
        }
        System.out.println();

        char[] niz2 = new char[20];
        /*
        srcBegin – indeks u stringu od kog počinje kopiranje

        srcEnd – indeks gde kopiranje prestaje (ne uključuje se u kopiranje)

        dst – niz karaktera (char[]) u koji se kopiraju karakteri

        dstBegin – indeks u tom nizu gde počinje upisivanje
         */
        recenica1.getChars(0, recenica1.length(), niz2, 0);
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz2[i] + " - ");
        }
        System.out.println("\n");

        //Ucitavanje karaktera po indeksnoj poziciji
        System.out.println("\nU recenici: (" + recenica1 + ") karakter na indeksnoj poziciji 7 je: " + recenica1.charAt(7) + "\n");

        //Ucitavanje pozicije na kojoj se nalazi karakter
        System.out.println("Prvo pojavljivanje karaktera \'a\' u recenici (" + recenica1 + ") je: " + recenica1.indexOf('a'));
        System.out.println("Zadnje pojavljivanje karaktera \'a\' u recenici (" + recenica1 + ") je: " + recenica1.lastIndexOf('a'));

        System.out.println();

        System.out.println("Prvo pojavljivanje karaktera \'r\' u recenici (" + recenica1 + ") je: " + recenica1.indexOf('r'));
        System.out.println("Zadnje pojavljivanje karaktera \'r\' u recenici (" + recenica1 + ") nakon 12. indeksne pozicije je: " + recenica1.lastIndexOf('r', 12));

        System.out.println();

        System.out.println("Posledje pojavljivanje karaktera \'r\' u recenici (" + recenica1 + ") je: " + recenica1.lastIndexOf('r'));
        System.out.println("Posledje pojavljivanje karaktera \'r\' u recenici (" + recenica1 + ") nakon 12. indeksne pozicije je: " + recenica1.lastIndexOf('r', 12));

        System.out.println();
        //Izvlacenje podnizova iz String objekata
        System.out.println("Podniz recenice (" + recenica1 + ") od 7. indeksne pozicije je: " + recenica1.substring(7));
        System.out.println("Podniz recenice (" + recenica1 + ") od 7. do 14. indeksne pozicije je: " + recenica1.substring(7, 14));
        System.out.println("\n");

        //Promena velicine slova
        System.out.println(recenica1 + " toUpperCase " + recenica1.toUpperCase());
        System.out.println(recenica1 + " toLowerCase " + recenica1.toLowerCase());

        System.out.println("\n");

        System.out.println(recenica1 + " nakon zamene 'r' u 'R' " + recenica1.replace('r', 'R'));
        System.out.println("\n");

        String recenica6 = "\tInformacione tehnologije \t\t";
        String recenica7 = recenica6.trim();
        System.out.println(recenica6 + " nakon uklanjana praznog prostora: " + recenica7 + ".");
        System.out.println("\n");

        String[] reci = recenica1.split(" ");
        for (String rec : reci) {
            System.out.println(rec + " | ");
        }


    }

}

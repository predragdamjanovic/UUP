package zadatak6;

import java.util.Arrays;

public class OpadajuceSortiranje {
    public static void main(String[] args) {
        int[] niz = {3, 5, 8, 19, -5, 45, -25, 17};
        System.out.println("Clanovi niza su: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " | ");
        }
        // sortiranje rastuce
        Arrays.sort(niz);
        System.out.println("Sortirani clanovi niza u rastucem: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " | ");
        }
        // logika za rotiranje clanova niza
        for (int i = 0, j = niz.length - 1; i < j; i++, j--) {
            int pomocnaVrednost = niz[i];
            niz[i] = niz[j];
            niz[j] = pomocnaVrednost;
        }
        System.out.println("Sortirani clanovi niza u opadajucem: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " | ");
        }
    }
}

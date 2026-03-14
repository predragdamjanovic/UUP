package zadatak5;

import java.util.Arrays;

public class SortiranjeNiza {
    public static void main(String[] args) {
        int[] niz =  {3,5,8,19,-5,45,-25,17};
        System.out.println("Clanovi niza su: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]+" | ");
        }
        // sortiranje rastuce
        Arrays.sort(niz);
        System.out.println("Sortirani clanovi niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]+" | ");
        }
    }
}

package zadatak4;

import java.util.Scanner;

public class MinMax {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        int max = 5;
        int min = -5;
        for (int i = 0; i < niz.length; i++) {
            int randomBr = (int) (Math.random() * (max - min + 1)) + min;
            niz[i] = randomBr;
            System.out.println("Clan sa brojem indeksa: " + i + " ima vrednost: " + niz[i]);
        }

        int minClan = niz[0];
        int maxClan = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < minClan) {
                minClan = niz[i];
            }
            if (niz[i] > maxClan) {
                maxClan = niz[i];
            }
        }
        System.out.println("\n");
        System.out.println("Min clan niza je: " + minClan);
        System.out.println("Max clan niza je: " + maxClan);
    }
}

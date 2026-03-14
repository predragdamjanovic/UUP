package zadatak2;

import java.util.Scanner;

public class IndeksClanaNiza {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite " + i + " clan niza:");
            niz[i] = sc.nextInt();
        }
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " | ");
            System.out.println("je clan sa indeksom: " + i);
        }
    }
}

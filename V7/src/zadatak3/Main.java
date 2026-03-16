package zadatak3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite prvi broj: ");
            int a = sc.nextInt();
            System.out.println("Unesite drugi broj: ");
            int b = sc.nextInt();
            System.out.println("Unesite treci broj: ");
            int c = sc.nextInt();

            System.out.println();

            System.out.println("Veci broj je: " + max(a, b));
            System.out.println("Manji broj je: " + min(a, b));
            System.out.println("Najveci od tri broja je: " + maximum(a, b, c));

            System.out.println("Novo racunanje: da/ne: ");
            String odgovor = sc.next();

            System.out.println();

            if (odgovor.equalsIgnoreCase("da")) {
                continue;
            } else {
                sc.close();
                break;
            }
        }

    }

    static int max(int a, int b) {
        return a > b ? a : b; // ako je a veci od b, vrati a, u suprotnom vrati b.
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int maximum(int a, int b, int c) {
        int maxi = a;
        if (b > maxi) {
            maxi = b;
        }
        if (c > maxi) {
            maxi = c;
        }
        return maxi;

    }
    /*
    alternativa - krace:
    static int maximum (int a, int b, int c){
    return Math.max(a, Math.max(b,c));
    }
     */

}

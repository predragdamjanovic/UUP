package zadatak2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();
        System.out.println("Zbir svih brojeva na " +
                "intervalu od " + a + " do " + b + " je: " + zbirInterval(a, b));
        System.out.println("Veci broj je: " + max(a, b));
        System.out.println("Manji broj je: " + min(a, b));

        sc.close();
    }

    static int zbirInterval(int a, int b) {
        int zbir = 0;
        for (int i = a; i <= b; i++) {
            zbir += i;
        }
        return zbir;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}



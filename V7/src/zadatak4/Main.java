package zadatak4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Krug");
        obimKruga();
        System.out.println("\n\nTrougao");
        povrsinaTrougla();
        System.out.println("\n\nKvadrat");
        dijagonalaKvadrata();


        sc.close();
    }

    static Scanner sc = new Scanner(System.in);

    static void obimKruga() {
        System.out.println("Poluprecnik r = ");
        double r = sc.nextDouble();
        System.out.println("Obim kruga je: " + 2 * r * Math.PI);
    }

    static void povrsinaTrougla() {
        System.out.println("Stranica a: ");
        double a = sc.nextDouble();
        System.out.println("Stranica b: ");
        double b = sc.nextDouble();
        System.out.println("Visina h: ");
        double h = sc.nextDouble();
        System.out.println("Povrsina trougla: " + (a * h) / 2);
    }

    static void dijagonalaKvadrata() {
        System.out.println("Stranica a: ");
        double a = sc.nextDouble();
        System.out.println("Dijagonala kvadrata d je: " + Math.sqrt(2 * Math.pow(a, 2)));
    }
}

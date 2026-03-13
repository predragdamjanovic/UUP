package zadatak2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int broj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        broj = sc.nextInt();
        while (broj != 0) {
            suma += broj;
            System.out.println("suma = " + suma);
            System.out.println("Za kraj programa unesite 0");
            System.out.println("Za nastavak unesite naredni broj: ");
            broj = sc.nextInt();
        }
        System.out.println("Kraj programa!");
    }
}

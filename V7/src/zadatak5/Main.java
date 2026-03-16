package zadatak5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Izaberite jednu od ponudjenih opcija: ");
            System.out.println("1. Obim kruga");
            System.out.println("2. Povrsina trougla");
            System.out.println("3. Dijagonala kvadrata");
            System.out.println("4. Kraj");
            System.out.print("\n>");
            int izbor = sc.nextInt();

            if (izbor == 4) {
                break;
            }

            System.out.println();

            switch (izbor) {
                case 1:
                    obimKruga();
                    break;
                case 2:
                    povrsinaTrougla();
                    break;
                case 3:
                    dijagonalaKvadrata();
                    break;
                default:
                    System.out.println("Takva opcija ne postoji!");
            }
        }

        System.out.println("Kraj programa!");
        sc.close();

    }

    static void obimKruga() {
        System.out.println("Poluprecnik r = ");
        double r = sc.nextDouble();
        System.out.println("Obim kruga je: " + obim(r));
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

    static double obim(double r) {
        return 2 * r * Math.PI;
    }

    static Scanner sc = new Scanner(System.in);
}

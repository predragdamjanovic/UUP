package zadatak5;

import java.util.Scanner;

public class Main {
    private static Scanner ulaz;

    public static void main(String[] args) {
        ulaz = new Scanner(System.in);
        long faktorijel = 1, n;
        System.out.println("Unesite broj od 1 - 25 da bi izracunali faktorijel: ");
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n < 1) {
                System.out.println("Uneli ste broj manji od 1");
                System.out.println("Ponovite unos: ");
                n = ulaz.nextInt();
            } else if (n > 25) {
                System.out.println("Uneli ste broj veci od 25");
                System.out.println("Ponovite unos: ");
                n = ulaz.nextInt();
            } else {
                faktorijel = faktorijel * i;

            }
        }
        System.out.println("faktorijel = " + faktorijel);
    }
}

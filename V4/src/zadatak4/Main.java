package zadatak4;

import java.util.Scanner;

public class Main {
    private static Scanner ulaz;

    public static void main(String[] args) {
        ulaz = new Scanner(System.in);
        long n, faktorijel = 1, i = 1;
        System.out.println("Unesite broj od 1 do 25: ");
        n = ulaz.nextInt();
        do {
            if (n > 25) {
                System.out.println("Uneli ste broj veci od 25!!");
                System.out.println("Unesite broj od 1 do 25!!");
                n = ulaz.nextInt();
            } else if (n < 1) {
                System.out.println("Uneli ste broj manji od 1");
                System.out.println("Unesite broj od 1 do 25!!");
                n = ulaz.nextInt();
            } else {
                faktorijel = faktorijel * i;
                i++;
            }
        } while (i <= n);
        System.out.println("Faktorijel iznosi: " + faktorijel);


    }
}

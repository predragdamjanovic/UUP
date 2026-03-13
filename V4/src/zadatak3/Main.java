package zadatak3;

import java.util.Scanner;

public class Main {
    private static Scanner ulaz;

    public static void main(String[] args) {
        ulaz = new Scanner(System.in);
        int tajniBroj;
        int unetiBroj;
        int brojac = 1;
        //int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        tajniBroj = (int) (Math.random() * (100 - 1 + 1)) + 1;
        System.out.println("Unesite broj: ");
        unetiBroj = ulaz.nextInt();

        while (unetiBroj != tajniBroj) {
            if (unetiBroj > tajniBroj) {
                System.out.println("Uneti broj je veci od tajnog broja!");
            } else if (unetiBroj < tajniBroj) {
                System.out.println("Uneti broj je manji od tajnog broja!");
            } else {
                break;
            }
            System.out.println("Pokusajte ponovo: ");
            unetiBroj = ulaz.nextInt();
            brojac++;
        }
        System.out.println("Pogodili ste broj.");
        System.out.println("Pogadjali ste: " + brojac + " puta.");
    }
}

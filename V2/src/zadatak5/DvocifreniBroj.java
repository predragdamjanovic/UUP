package zadatak5;

import java.util.Scanner;

public class DvocifreniBroj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifreni broj: ");
        int a = sc.nextInt();
        System.out.println("Dvocifreni broj: " + a);
        int x, y;
        y = a % 10;
        x = a / 10;
        System.out.println("Cifra jedinice: " + y + " i cifra desetice: " + x);
        System.out.println("Ispis unazad: " + y + x);


    }
}

package zadatak1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int unetiBroj = sc.nextInt();

        if (unetiBroj > 500) {
            System.out.println("Uneti broj je veci od 500");
        } else {
            System.out.println("Uneti broj je manji od 500");
        }
    }
}

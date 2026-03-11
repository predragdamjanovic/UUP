package zadatak4;

import java.util.Scanner;

public class Ime {
    public static void main(String[] args) {
        String ime = "Predrag Damjanovic";
        System.out.println("Asistent: " + ime);
        System.out.println("Unesi svoje ime: ");

        Scanner sc = new Scanner(System.in);
        String imeUnos = sc.nextLine();

        System.out.println("Student: " + imeUnos);

    }
}

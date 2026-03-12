package zadatak3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime deteta: ");
        String imeDeteta = sc.next();
        System.out.println("Unesite broj godina deteta: ");
        int brojGodinaDeteta = sc.nextInt();
        System.out.println("Unesite rezultat testiranja (broj bodova): ");
        int brojBodovaTestiranja = sc.nextInt();

        if (brojGodinaDeteta > 6 && brojBodovaTestiranja >= 75) {
            System.out.println("Dete moze upisati prvi razred!");
        } else System.out.println("Dete treba sacekati narednu godinu kako bi upisao prvi razred.");
    }
}

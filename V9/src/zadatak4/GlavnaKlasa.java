package zadatak4;

import java.util.Scanner;

public class GlavnaKlasa {
    private static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {
        String ime;
        double tezina, visina;
        System.out.println("Unesite ime deteta: ");
        ime = ulaz.nextLine();
        System.out.println("Unesite visinu deteta: ");
        visina = ulaz.nextDouble();
        System.out.println("Unesite tezinu deteta: ");
        tezina = ulaz.nextDouble();

        Dete beba = new Dete(ime, visina, tezina);
        beba.informacije();

        System.out.println("Unesite novu visinu deteta: ");
        visina = ulaz.nextDouble();
        System.out.println("Unesite novu tezinu deteta: ");
        tezina = ulaz.nextDouble();

        beba.unosNoveVisine(visina);
        beba.unosNoveTezine(tezina);
        beba.informacije();
    }
}

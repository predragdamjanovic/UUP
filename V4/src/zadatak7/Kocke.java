package zadatak7;

import java.util.Scanner;

public class Kocke {
    public static void main(String[] args) {
        Scanner ulaz1 = new Scanner(System.in);
        Scanner ulaz2 = new Scanner(System.in);
        int kocka1, kocka2, balans, brojac = 1;
        int korsnikovBroj; // ovo je broj na koji se korisnik kladi od 2- 12
        String izbor;
        System.out.println("Svako bacanje kosta 100 apoena. Unesite balans za igru: ");
        balans = ulaz1.nextInt();

        System.out.println("Unesite broj na koji se kladite od 2-12: ");
        korsnikovBroj = ulaz1.nextInt();


        do {
            if (korsnikovBroj < 2 || korsnikovBroj > 12) {
                System.out.println("Uneli ste broj manji od 2 ili veci od 12");
                System.out.println("Izlaz iz programa");
                break;
            }
            kocka1 = (int) (Math.random() * (6 - 1 + 1)) + 1;
            kocka2 = (int) (Math.random() * (6 - 1 + 1)) + 1;
            int kockaZbir = kocka1 + kocka2;
            brojac++;

            if (korsnikovBroj != kockaZbir) {
                System.out.println("Promasili ste");
                balans -= 100;
                System.out.println("Balans: " + balans);
                if (balans < 100) {
                    System.out.println("Nemate kredita.");
                    break;
                }
            } else {
                System.out.println("POGODAK!");
                balans += 300;
                System.out.println("Balans: " + balans);
            }
            System.out.println("Da li zelite da nastavite? da/ne:");
            izbor = ulaz2.next();
            if (izbor.equalsIgnoreCase("da")) {
                System.out.println("Unesite broj na koji se kladite od 2-12: ");
                korsnikovBroj = ulaz1.nextInt();
                if (korsnikovBroj < 2 || korsnikovBroj > 12) {
                    System.out.println("Uneli ste broj manji od 2 ili veci od 12");
                    System.out.println("Izlaz iz programa");
                    break;
                }

            } else if (izbor.equalsIgnoreCase("ne")) {
                System.out.println("Izlazak iz programa!");
                break;
            } else {
                System.out.println("Nite lepo uneli opciju. Izlazak iz programa!");
                break;
            }
        } while (balans >= 100);
    }
}

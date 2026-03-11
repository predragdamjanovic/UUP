package zadatak5;

import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        System.out.println("Unesite velicinu stranice kvadrata: ");
        double stranica;
        Scanner sc = new Scanner(System.in);

        stranica = sc.nextDouble();

        double obim = stranica * 4;
        double povrsina = stranica * stranica;

        System.out.println("obim = " + obim);
        System.out.println("povrsina = " + povrsina);
    }
}

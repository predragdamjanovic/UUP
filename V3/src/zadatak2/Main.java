package zadatak2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double prviBroj = sc.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double drugiBroj = sc.nextDouble();

        if (prviBroj > drugiBroj) {
            System.out.println("Prvi broj je veci");
        } else if (drugiBroj > prviBroj) {
            System.out.println("Drugi broj je veci");
        } else System.out.println("Brojevi su jednaki");
    }
}

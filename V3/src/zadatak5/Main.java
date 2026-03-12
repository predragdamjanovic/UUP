package zadatak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double a = sc.nextDouble();
        System.out.println("Unesite zeljenu operaciju: ");
        String operacija = sc.next();
        System.out.println("Unesite drugi broj: ");
        double b = sc.nextDouble();
        double c;

        if (operacija.equals("+")) {
            c = a + b;
            System.out.println("Zbir je: " + c);
        } else if (operacija.equals("-")) {
            c = a - b;
            System.out.println("Razlika je: " + c);
        } else if (operacija.equals("*")) {
            c = a * b;
            System.out.println("Prozivod je: " + c);
        } else if (operacija.equals("/")) {
            c = a / b;
            System.out.println("Kolicnik je: " + c);
        } else System.out.println("Niste uneli odgovoarajucu operaciju");
    }
}

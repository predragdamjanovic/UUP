package zadatak1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesi drugi broj: ");
        int b = sc.nextInt();

        int r = razlika(a, b);
        int p = proizvod(a, b);
        double k = kolicnik(a,b);

        sc.close();
    }

    static void zbir(int a, int b) {
        int c = a + b;
        System.out.println("Zbir brojeva je: " + c);
    }

    static int razlika(int a, int b) {
        return a - b;
    }

    static int proizvod(int a, int b) {
        return a * b;
    }
    static double kolicnik(int a, int b){
        return (double) a/b;
    }
}

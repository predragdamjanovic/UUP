package zadatak3;

public class SumaProsek {
    public static void main(String[] args) {
        int[] niz = {3, 5, 8, 19, -5, 45, -25, 17};
        int brojac = 0;
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
            brojac++;
        }
        double srednjaVrednost;
        srednjaVrednost = (double) suma / brojac;
        System.out.println("Suma clanova niza je: " + suma);
        System.out.println("Srednja vrednost clanova niza je: " + srednjaVrednost);
    }
}

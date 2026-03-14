package zadatak2;

import java.util.Scanner;

public class SumaProsek {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Unesite broj redova: ");
        int n = sc.nextInt();
        System.out.println("Unesite broj kolona: ");
        int m = sc.nextInt();
        int[][] matrica = new int[n][m];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Unesite clan matrice na poziciji :["+i+"]:["+j+"] ");
                matrica[i][j] = sc.nextInt();
                suma += matrica[i][j];

            }
            System.out.println("########");
        }
        double srednjaVrednost = (double) suma / (n * m);
        System.out.println("srednjaVrednost = " + srednjaVrednost);
        System.out.println("suma = " + suma);
    }
}

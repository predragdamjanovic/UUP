package zadatak4;

import java.util.Scanner;

public class GlavnaDijagonala {
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = sc.nextInt();
        int[][] matrica = new int[n][n];
        System.out.println("Unesi clanove: ");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = sc.nextInt();
            }
            System.out.println("###");
        }
        System.out.println("Clanovi glavne dijagonale (i == j)");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (i == j) System.out.println(matrica[i][j]);
            }
        }
    }
}

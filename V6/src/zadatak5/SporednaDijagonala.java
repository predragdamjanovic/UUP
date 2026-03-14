package zadatak5;

import java.util.Scanner;

public class SporednaDijagonala {


    public static void main(String[] args) {


        int[][] matrica = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        int n = matrica.length;
        System.out.println("Unesi clanove: ");

        System.out.println("Clanovi sporedne dijagonale (i + j = n-1)");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (i + j == n - 1) System.out.println(matrica[i][j]);
            }
        }
    }
}
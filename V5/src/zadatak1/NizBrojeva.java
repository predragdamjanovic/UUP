package zadatak1;

public class NizBrojeva {
    public static void main(String[] args) {
        // deklaracija niza sa inicijalizacijom niza
        int[] nizA = {2, 4, 6, 8, 10, 1, 5, 7, 9};
        // koristimo for petlju da prodjemo kroz
        // ceo niz i ispisemo njihove vrednosti
        for (int i = 0; i < 10; i++) {
            System.out.println(nizA[i] + " | ");
        }

        System.out.println("\n"); //nov red
        System.out.println("Sve ovo samo na drugi način");
        // deklaracija i instanciranje niza
        int[] nizB = new int[10];
        // inicijalizacija
        nizB[0] = 2;
        nizB[1] = 4;
        nizB[2] = 6;
        nizB[3] = 8;
        nizB[4] = 10;
        nizB[5] = 1;
        nizB[6] = 3;
        nizB[7] = 5;
        nizB[8] = 7;
        nizB[9] = 9;
        // ovaj put koristimo izraz lenght u petlji
        for (int i = 0; i < nizB.length; i++) {
            System.out.println(nizB[i] + " | ");
        }
    }
}

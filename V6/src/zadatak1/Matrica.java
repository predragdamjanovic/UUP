package zadatak1;

public class Matrica {
    public static void main(String[] args) {
    int[][] matrica = new int[4][5];
        for (int i = 0; i < matrica.length ; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = i;
                System.out.print(" "+matrica[i][j]);
            }
            System.out.println();
        }
    }
}

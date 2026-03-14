package zadatak3;

public class MinMax {
    public static void main(String[] args) {
        int[][] matrica = {{-1, 12, 0}, {5, 9, 1}, {8, -6, 3}};
        int min = matrica[0][0];
        int max = matrica[0][0];
        for (int i = 0 ; i < matrica.length;i++){
            for (int j = 0; j<matrica[i].length;j++){
                if (matrica[i][j]<min){
                    min = matrica[i][j];
                }
                if (matrica[i][j]>max){
                    max = matrica[i][j];
                }
            }
        }
        System.out.println("Min clan matrice je: "+min);
        System.out.println("Max clan matrice je: "+max);
    }
}

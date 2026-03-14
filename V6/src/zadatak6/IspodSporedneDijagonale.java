package zadatak6;

public class IspodSporedneDijagonale {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        m[0][0] = 1;m[0][1] = 5;m[0][2] = 2;m[0][3] = 0;m[0][4] = 6;
        m[1][0] = 0;m[1][1] = 8;m[1][2] = 1;m[1][3] = 3;m[1][4] = 4;
        m[2][0] = 4;m[2][1] = 9;m[2][2] = 7;m[2][3] = 3;m[2][4] = 2;
        m[3][0] = 7;m[3][1] = 8;m[3][2] = 2;m[3][3] = 0;m[3][4] = 1;
        m[4][0] = 6;m[4][1] = 5;m[4][2] = 2;m[4][3] = 7;m[4][4] = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(" "+m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int n = 5;
        System.out.println("Clanovi iznad sporedne dijagonale: ");
        for (int i = 0; i<m.length;i++){
            for (int j = 0 ; j<m[i].length;j++){
                if (i + j >n -1){
                    System.out.println(m[i][j]);
                }
            }
        }
    }
}

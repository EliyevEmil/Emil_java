package lesson84;

public class Main {
    public static void main(String[] args) {

        int[][] matris = {
                {3, -5, 12},
                {-1, 8, 0},
                {4, 15, -9}
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] > 0) {
                    System.out.println(matris[i][j]);
                }
            }
        }
    }
}
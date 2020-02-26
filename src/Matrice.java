import java.util.Random;

public class Matrice {

    public int[][] matrix(int m, int n, int a, int b){
        int[][] matrice = new int[m][n];

        for(int i = 0; i<m;i++)
            for(int j = 0; j<n;j++){
                int nombre = a + (int) (Math.random() * ((b-a) + 1));
                matrice[i][j] = nombre;
            }
        return matrice;
    }

}

public class Matrice {

    public int[][] matrix(int m, int n, int a, int b){
        int[][] matrice = new int[m][n];

        for(int i = 0; i<matrice.length;i++)
            for(int j = 0; j<matrice.length;j++){
                int nombre = (int) (Math.random()*100) + a;
                matrice[i][j] = nombre;
            }
        return matrice;
    }
}

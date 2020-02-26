public class App {
    public static void main(String[] args) {
        /*int tab[]=new int[6];
        Square square = new Square();
        tab= square.racine(2,6);
        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }*/

        Matrice mat = new Matrice();
        int[][] tab = mat.matrix(4, 5, 2, 6);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}

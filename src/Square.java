public class Square {
    public static int[] racine(int A,int B){
        int tab[] = new int[1+(B-A)];
        int indice_tab=0;
        for (int i=A;i<=B;i++){
            tab[indice_tab]=(int)Math.sqrt(i);
            indice_tab++;
        }
        return tab;
    }
    public static void main(String[] args) {
        int tab[]=new int[6];
        tab=racine(2,6);
        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}

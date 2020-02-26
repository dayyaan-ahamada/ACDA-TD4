import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {


    private int M;
    private int N;
    private int A;
    private int B;
    private Matrice m = new Matrice();
    private int[][] tab;

    @BeforeEach
    void setUp() {
        M = 2;
        N = 6;
        A = 15;
        B = 20;
        tab = new int[100][100];
        tab=m.matrix(M,N,A,B);
    }

    @AfterEach
    void tearDown() {
        M = 0;
        N = 0;
        A = 0;
        B = 0;
    }

    @Test
    void matrice_ligne(){
        assertEquals(2,tab.length);
    }
    @Test
    void matrice_colonne(){
        assertEquals(6,tab[0].length);
        assertEquals(6,tab[1].length);
    }
    @Test
    void nombre_compris_entre_A_et_B(){
        for (int i=0;i<2;i++){
            for (int j=0;j<6;j++){
                assertTrue(tab[i][j]>=15);
                assertTrue(tab[i][j]<=20);
            }
        }
    }

}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    private int a;
    private int b;
    private Square square = new Square();

    private int[] aTester = new int [5];


    @BeforeEach
    void setUp() {
        a = 2;
        b = 6;
        aTester = square.racine(a,b);

    }

    @AfterEach
    void tearDown() {
        a = 0;
        b = 0;
    }

    @Test
    void the_two_tab_should_be_the_same_size(){
        assertEquals(5,aTester.length);
    }

    @Test
    void test(){
        assertEquals(1,aTester[0]);
        assertEquals(1,aTester[1]);
        assertEquals(2,aTester[2]);
        assertEquals(2,aTester[3]);
        assertEquals(2,aTester[3]);
    }
}
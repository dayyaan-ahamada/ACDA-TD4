import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    private int a;
    private int b;
    private int[] tab;

    @BeforeEach
    void setUp() {
        a = 2;
        b = 6;
        tab = new int[]{2, 3, 4, 5, 6};
    }

    @AfterEach
    void tearDown() {
        a = 0;
        b = 0;
        tab = new int[]{};
    }

    @Test
    void the_two_tab_should_be_the_same(){
        int[] testTab = {1,1,2,2,2};
        assertEquals(testTab,this.tab);
    }
}
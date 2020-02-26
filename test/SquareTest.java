import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

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
    }
}
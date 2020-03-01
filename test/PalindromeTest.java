import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome p = new Palindrome();

    @Test
    void phrase(){
        assertEquals(5,p.palindrome("aa keo kj sldl oo mlkklm kayak ij etyyte"));
    }
    @Test
    void phrase_null() {
        assertEquals(0,p.palindrome(""));
    }
    @Test
    void phrase_avec_2_espaces() {
        assertEquals(2,p.palindrome("lll  ll"));
    }
    @Test
    void phrase_avec_3_espaces() {
        assertEquals(2,p.palindrome("mm   mm"));
    }
}
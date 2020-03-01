import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome p = new Palindrome();

    @Test
    void test(){
        assertEquals(5,p.palindrome("aa keo kj sldl oo mlkklm kayak ij etyyte"));
        assertEquals(0,p.palindrome(""));
        assertEquals(2,p.palindrome("lll  ll"));//avec 2 espaces
        assertEquals(2,p.palindrome("mm   mm"));//avec 3 espaces
    }
}
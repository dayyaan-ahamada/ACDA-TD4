import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private int a;
    private int b;
    private int c;
    private Triangle triangle = new Triangle();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        a = 0;
        b = 0;
        c = 0;
    }

    @Test
    void the_triangle_should_be_scalene(){
        a = 3;
        b = 6;
        c = 4;
        assertEquals(3, triangle.triangle(a,b,c));
    }
    @Test
    void the_triangle_should_be_isosceles(){
        a = 3;
        b = 6;
        c = 3;
        assertEquals(1, triangle.triangle(a,b,c));
    }
    @Test
    void the_triangle_should_be_equilateral(){
        a = 4;
        b = 4;
        c = 4;
        assertEquals(2, triangle.triangle(a,b,c));
    }
    @Test
    void the_triangle_should_not_be_a_triangle(){
        a = -2;
        b = 18;
        c = 0;
        assertEquals(4, triangle.triangle(a,b,c));
    }
}
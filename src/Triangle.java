public class Triangle {

    public int triangle(int a, int b, int c){
        int result = 0;

        if(a == b && b == c)
            result = 2;

        else if(a == b || b == c || a == c)
            result = 1;

        else if(a != b && a != c && b != c)
            result = 3;

        else
            result = 4;

        return result;
    }
}

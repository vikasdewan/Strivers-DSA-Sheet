package Arrays.hard;
import java.util.*;

public class PascalTriangleVariant1 {

    public static void main(String[] args) {
        
        int r=5;
        int c = 3;
        int element = pascalTriangle(r, c);
        System.out.println(element);
    }

    public static int pascalTriangle(int r, int c){
        int element = (int) nCr(r-1,c-1);
        return element;
    }

    public static long nCr(int n, int r){
        long res = 1;
        for(int i = 0 ;i<r;i++){
            res = res * ( n - i );
            res = res / ( i + 1 );
        }
        return res;
    }
}
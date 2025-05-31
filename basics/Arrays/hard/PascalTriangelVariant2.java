package Arrays.hard;
import java.util.*;

public class PascalTriangelVariant2 {
    
    public static void main(String[] args) {
        
        int r = 4;
        ArrayList<Integer> ans =  pascalTriangle(r);
        System.out.println(ans);
    }

    public static ArrayList<Integer> pascalTriangle(int r){
        int c = r;
        ArrayList<Integer> list = new ArrayList<>();
        return elements(list,r-1,c-1);
    }

    public static ArrayList<Integer> elements(ArrayList<Integer> list , int n ,int r){
        if(r<0){
            return list;
        }
        int res = 1;
        for(int i = 0 ;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        list.add(res);
        return elements(list,n,r-1);
    }

}

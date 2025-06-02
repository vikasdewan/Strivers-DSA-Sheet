package Arrays.hard;
import java.util.*;

public class MajorityElement {
    
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,1,1,3,2,2};
        ArrayList<Integer> ans = majorityElementtwo(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> majorityElementtwo(int[] arr) {
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();

    // Count frequency of each element
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    ArrayList<Integer> list = new ArrayList<>();

    // Add elements that appear more than n/3 times (only once)
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > n / 3) {
            list.add(entry.getKey());
        }
    }

    return list;
}

}

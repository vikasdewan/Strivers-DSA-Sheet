package Strings.Medium;

 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
 

public class SortCharByFreq {
    

    public static void main(String[] args) {
        String s = "cccaaa";
        sortCharByFrequency(s);
    }

    public static void sortCharByFrequency(String s) {
        // Step 1: Count frequency of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(freqMap.keySet());
        // Step 2: Create a list of characters and sort it by frequency
        List<Character> chars = new ArrayList<>(freqMap.keySet());
        System.out.println(chars);
        chars.sort((a, b) -> freqMap.get(b) - freqMap.get(a)); // Descending sort

        // Step 3: Build the output string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        // Output the final result
        System.out.println(result.toString());
    }

     
}

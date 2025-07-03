package Strings.Easy;

public class LongestCommonPrefix{

    public static void main(String[] args) {
        
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixString(strs)); // "fl"
    }

   public static String longestCommonPrefixString(String[] arr) {
    if (arr == null || arr.length == 0) return "";
    if (arr.length == 1) return arr[0];

    // Step 1: Find the shortest string
    String minStr = arr[0];
    for (String s : arr) {
        if (s.length() < minStr.length()) {
            minStr = s;
        }
    }

    // Step 2: Compare each character index across all strings
    StringBuilder prefix = new StringBuilder();
    for (int i = 0; i < minStr.length(); i++) {
        char c = minStr.charAt(i);
        for (String s : arr) {
            if (s.charAt(i) != c) {
                return prefix.toString(); // early exit if mismatch
            }
        }
        prefix.append(c);
    }

    return prefix.toString();
}
}
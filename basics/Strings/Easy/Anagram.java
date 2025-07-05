package Strings.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagramOpt(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            list.remove((Character) t.charAt(i));
        }
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // optimal
    public static boolean isAnagramOpt(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
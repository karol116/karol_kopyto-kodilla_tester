package leetcode;

import org.hibernate.mapping.Collection;

import java.util.*;

public class leetcode {

    public static String sort(String word) {
        char tempArrayS[] = word.toCharArray();
        Arrays.sort(tempArrayS);
        return new String(tempArrayS);
    }

    public static boolean isAnagram(String s, String t){
        String sortedS = sort(s);
        String sortedT = sort(t);
        return sortedS.equals(sortedT);
    }



    public static void main(String[] args) {
        boolean falseTest = isAnagram("cacc", "acac");
        System.out.println(falseTest);
        boolean isTrue = isAnagram("anagram", "nagaram");
        System.out.println(isTrue);
        boolean isFalse = isAnagram("rat", "cat");
        System.out.println(isFalse);
    }
}

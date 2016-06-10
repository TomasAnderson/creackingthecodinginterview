import java.util.*;

class P1_4 {
  public static void main(String[] args) {
    String word1 = "abcde";
    String word2 = "edcba";
    if (areAnagrams(word1, word2)) {
      System.out.println("They are anagrams.");
    } else {
      System.out.println("They are not anagrams.");
    }
  }

  static Boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    } else {
      Boolean result = true;
      int len = str1.length();
      for (int i=0; i<str1.length(); i++) {
        if (str1.charAt(i) != str2.charAt(len-i-1)) {
          result = false;
        }
      }
      return result;
    }
  }
}
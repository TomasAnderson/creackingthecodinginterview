import java.util.*;

class P1_3 {
  public static void main(String[] args) {
    runRemoveDuplicateCharTest();
  }

  static String removeDuplicateChar(String str) {
    String result = "";
    for(int i=0; i<=str.length()-1; i++) {
      if (str.indexOf(str.charAt(i)) == i) {
        result += str.charAt(i);
      }
    }
    return result;
  }

  static void runRemoveDuplicateCharTest() {
    String val;
    val = removeDuplicateChar("a");
    System.out.println("a".equals(val));
    val = removeDuplicateChar("");
    System.out.println("".equals(val));
    val = removeDuplicateChar("abcde");
    System.out.println("abcde".equals(val));
    val = removeDuplicateChar("abcdeabcdee");
    System.out.println("abcde".equals(val));
    val = removeDuplicateChar("abcde");
    System.out.println("abcde".equals(val));
    val = removeDuplicateChar("abcdeabgh");
    System.out.println("abcdegh".equals(val));
    val = removeDuplicateChar("abcdegh");
    System.out.println("abcdegh".equals(val));
  }

}
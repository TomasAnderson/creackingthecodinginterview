import java.util.*;

class P1_8 {
  public static void main(String[] args) {
    String str1 = "waterbottle";
    String str2 = "erbottlewat";
    Boolean result = isRotation(str1, str2);
    if (result) {
      System.out.println("They are rotation words.")
    } else {
      System.out.println("They are not rotation words.");
    }
  }

  static boolean isRotation(String str1, String str2) {
    if (str1.length != str2.length) {
      return false;
    } else {
      String str1str1 = str1 + str1;
      return str1.isSubstring(str1str1, str2);
    }
  }
}
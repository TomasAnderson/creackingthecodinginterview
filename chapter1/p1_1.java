import java.util.*;

class uniqChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      Boolean result = areUniqueChar(sc.nextLine());
      if(result) System.out.println("unique!");
      else System.out.println("not unique!");      
    }
  }

  static Boolean areUniqueChar(String str) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i=0; i<str.length(); i++) {
      if (!map.containsValue(str.charAt(i))) {
          map.put(str.charAt(i), i);    
      }
    }
    return str.length() == map.size();
  }
}
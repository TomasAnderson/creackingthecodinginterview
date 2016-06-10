class P1_5 {
  public static void main(String[] args) {
    String str = " a    b  c       d                 e gsa  ";
    String result = replaceSpace(str);
    System.out.println(result);
    System.out.println(result.equals("%20a%20b%20c%20d%20e%20gsa%20"));
  }

  static String replaceSpace(String str) {
    Boolean isPreviousSpace = false;
    String result = "";
    for (int i=0; i<str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (isPreviousSpace) {
          //do nothing
        } else {
          isPreviousSpace = true;
          result += "%20";          
        }
      } else {
        isPreviousSpace = false;
        result += str.charAt(i);
      }
    }
    return result;
  }
}
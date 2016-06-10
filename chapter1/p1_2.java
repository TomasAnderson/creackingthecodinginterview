class ReverseString {
  public static void main(String[] args) {
    String str = "abcd";
    String result = reverse(str);
    System.out.println(result);    
  }  

  static String reverse(String str) {
    char[] charArr = str.toCharArray();
    char[] result = new char[charArr.length];
    for(int i=charArr.length-1, j=0; i>=0; i--) {
      result[j++]= charArr[i];
    }
    return new String(result);
  }
}
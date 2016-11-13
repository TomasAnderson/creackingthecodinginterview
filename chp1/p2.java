import java.util.*;

class P2 {
    public static void main(String[] args) {
        String str1 = "do g";
        String str2 = "god";
        System.out.println(isPermutation(str1, str2));
        System.out.println(isPermutation2(str1, str2));
    }

    public static boolean isPermutation(String str1, String str2) {
        //assume case-sensitivity matters
        //assume whitespace doesnot matter
        str1 = cleanWhiteSpace(str1);
        str2 = cleanWhiteSpace(str2);

        if(str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public static String cleanWhiteSpace(String str) {
        str = str.trim();
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s: strArr) {
            sb.append(s.trim());
        }
        return sb.toString();
    }

    public static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation2(String str1, String str2) {
        //assume two strings are ASCII strings
        int[] charCount = new int[128];

        str1 = cleanWhiteSpace(str1);
        str2 = cleanWhiteSpace(str2);
        if (str1.length() != str2.length()) {
            return false;
        }
        for(int i=0; i<str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }
        for(int j=0; j<str2.length(); j++) {
            charCount[str2.charAt(j)]--;
            if (charCount[str2.charAt(j)] < 0) {
                return false;
            }
        }
        return true;
    }
}

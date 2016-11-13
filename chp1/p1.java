import java.util.*;

class P1 {

    public static void main(String[] args) {
        String str = "Is this string unique?";
        System.out.println(isUnique(str));
        System.out.println(isUnique2(str));
        System.out.println(isUnique3(str));
    }

    public static boolean isUnique(String str) {
        //this solution make use HashSet ds
        HashSet<String> hs = new HashSet<String>();
        String[] strArr = str.split("");
        boolean isunique = true;
        for(String e: strArr) {
            if (hs.contains(e)) {
                isunique = false;
                break;
            } else {
                hs.add(e);
            }
        }
        return isunique;
    }
    
    public static boolean isUnique2(String str) {
        //assume string is an ASCII string
        if(str.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for(int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) return false;
            else charSet[val] = true;
        }
        return true;
    }

    public static boolean isUnique3(String str) {
        //if no additional data structure is allowed. 
        //it runs in O(nlogn)
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) 
                    return false;
            }
        }
        return true;
    }
}

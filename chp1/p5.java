import java.util.*;

class P5 {
    public static void main(String[] args) {
        System.out.println(isOneWay("pale", "pal"));
        System.out.println(isOneWay("pales", "pale"));
        System.out.println(isOneWay("pale", "bale"));
        System.out.println(isOneWay("pale", "bake"));
    }

    public static boolean isOneWay(String str1, String str2) {
        if(str1.equals(str2)) return true;
            
        char[] charSet1 = str1.toCharArray();
        char[] charSet2 = str2.toCharArray();
        int l1 = charSet1.length;
        int l2 = charSet2.length;

        if (l1 == l2){//one edit away
            boolean diffFound = false;
            for(int i=0; i<charSet1.length; i++) {
                if(charSet1[i] != charSet2[i]) {
                    if(diffFound) return false;
                    diffFound = true;
                }
            
            }
            return true;
        } else if(l1-l2 == 1){//one removal away
            int i=0, j=0;
            boolean diffFound = false;
            while (i < l1 && j < l2) {
                if(charSet1[i] == charSet2[j]) {
                    i++;
                    j++;
                } else if(!diffFound) {
                    diffFound = true;
                    i++;
                } else {
                    return false;
                }
            }
            return true;
        } else if(l2-l1 == 1) {//one insertion away
            int i=0, j=0;
            boolean diffFound = false;
            while( i<l1 && j < l2) {
                if(charSet1[i] == charSet2[i]) {
                    i++;
                    j++;
                } else if(!diffFound) {
                    diffFound = true;
                    j++;
                } else {
                    return false;
                }
            }
            return true;
        } 
        return false;
        

    }
}


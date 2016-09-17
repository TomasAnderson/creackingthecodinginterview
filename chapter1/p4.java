import java.util.*;

class P4 {
    public static void main(String[] args) {
        String str = "Tact Coa";
        System.out.println(check(str));
        System.out.println(check2(str));
    }

    /*this method check whether the permutation of a string is a palindrom*/
    public static boolean check(String str) {
        str = clean(str);
        int[] charSet = new int[128];
        for(int i=0; i<str.length(); i++) {
            charSet[(int) str.charAt(i)]++;
        }
        int oddCount=0;
        for(int i=0; i<128; i++) {
            if(charSet[i]%2==1) {
                oddCount++;
            }
        }
        if(str.length()%2==0 && oddCount==0 || str.length()%2==1 && oddCount ==1){
            return true;
        }
        return false;
    }

    public static String clean(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strArr.length; i++) {
            sb.append(strArr[i].trim());
        }
        return sb.toString().toLowerCase();
    }

    /*this method use bit-wise manipulation to solve this problem*/
    public static boolean check2(String str) {
        char[] charArr = str.toCharArray();
        int intVector = 0;
        for(char c: charArr) {
            int x = getCharValue(c);
            intVector = toggle(intVector, x);
        }
        return isPalindromeVector(intVector);
    }
    public static int getCharValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a<=val && val<=z) {
            return val-a;
        } else {
            return -1;
        }
    }
    public static int toggle(int intVector, int index) {
        if (index < 0) return intVector;
        int mask = (1 << index);
        if((intVector & mask) == 0) {
            intVector |= mask;
        } else {
            intVector &= ~mask;
        }
        return intVector;
    }
    public static boolean isPalindromeVector(int intVector) {
        return intVector == 0 || ((intVector&(intVector-1)) == 0);
    }
}


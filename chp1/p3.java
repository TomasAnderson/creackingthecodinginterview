import java.util.*;

class P3 {
    public static void main(String[] args) {
        char[] content = "Mr John Smith    ".toCharArray();
        System.out.println(URLify(content, 13));
    }

    public static String URLify(char[] str, int trueLen){
        int spaceCount = 0, i;
        for(i=0; i<trueLen; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        int lastIndex = spaceCount*2 + trueLen;

        for(int j=trueLen-1; j>=0; j--) {
            if(str[j] == ' ') {
                str[lastIndex-1] = '0';
                str[lastIndex-2] = '2';
                str[lastIndex-3] = '%';
                lastIndex-=3;
            } else {
                str[lastIndex-1] = str[j];
                lastIndex--;
            }
        }
        return new String(str);
    }
}

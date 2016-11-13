import java.util.*;

class P6 {
    public static void main(String[] args){
        String str = "aabcccccaaa";
        System.out.println(comprehend(str));
    }

    public static String comprehend(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            count++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(0));
                sb.append(count);
                count = 0;
            }
        }

        return sb.length() < str.length() ? sb.toString() : str;
    }

}

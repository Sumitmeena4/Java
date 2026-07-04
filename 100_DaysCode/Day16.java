
import java.util.Arrays;

public class Day16 {
    public static void main(String[] args){
        System.out.println(sortString("me lapata"));

    }

    public static String copyString(String s){  
        // String s2 = s;
        String s2 = new String(s);
        return s2;
    }

    static String sortString(String s){
        
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char c : ch)
            sb.append(c);
        return sb.toString();
    }
}

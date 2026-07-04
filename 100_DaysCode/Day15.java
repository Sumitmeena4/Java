public class Day15 {
    public static void main(String[] arg){

        Day15 obj = new Day15();
        System.out.println(obj.removeBlank("The peeter piper"));
    }

    public String removeBlank(String s){
        //String result = s.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' ')
                sb.append(ch);
        }
        return sb.toString();
    }

    public String removeRepeated(String s){
        
        // String str = "";
        // for(int i=0; i<s.length(); i++){
        //     if(str.indexOf(s.charAt(i)) == -1)
        //         str += s.charAt(i);
        // }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) == -1)
                sb.append(ch);
        }
        return sb.toString();
    }

    public int sumOfNums(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                sum += ch - '0';
        }
        return sum;
    }

    public String printNonRepeating(String s){

        int[] freq = new int[256];

        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)]++;
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch] ==1)
                sb.append(ch);
        }
        return sb.toString();
    }
}

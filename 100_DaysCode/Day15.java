public class Day15 {
    public static void main(String[] arg){

        Day15 obj = new Day15();
        System.out.println(obj.printNonRepeating("12312345"));
    }

    public String removeBlank(String s){
        //String result = s.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ')
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String removeRepeated(String s){
        
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(str.indexOf(s.charAt(i)) == -1)
                str += s.charAt(i);
        }
        return str;
    }

    public int sumOfNums(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if("1234567890".indexOf(s.charAt(i)) != -1){
                char ch = '0';
                sum += s.charAt(i) - ch;
            }
        }
        return sum;
    }

    public String printNonRepeating(String s){

        String str = "";
        for(int i=0; i<s.length(); i++){
            if(str.indexOf(s.charAt(i)) == -1){
                str += s.charAt(i);
            }
        }
        return str;
    }
}

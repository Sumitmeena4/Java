public class StBuilders{
    public static void main(String [] arg){
        // String str = "hey, how are you?";
        // System.out.println(toUppercase(str));
    }

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String StCompression(String str){
        for(int i=0; i<str.length(); i++){
            int count = 1;

            while(str.charAt(i)==str.charAt(i)){
                count++;
                i++;
            }
            if(count>1){
                System.out.print(count);
            } else{
                System.out.print("");
            }  
        }
        return "";
    }
}
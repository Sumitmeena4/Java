public class Day9 {
    public static void main(String[] arg){

        String str = "Believe in your self, Be confident.";
        String2 string2 = new String2();
        System.out.println(string2.removeBlanks(str));
    }
}

class String2{

    public String removeFirstVowel(String str){

        // String newString = "";
        // int n = 0;
        // for(int i=0; i<str.length(); i++){
        //     if("aeiou".indexOf(str.charAt(i)) == -1){
        //         newString += str.charAt(i);
        //     }
        //     else{
        //         newString += '-';
        //         n = ++i;
        //         break;                
        //     }
        // }
        // if(n!=0){
        //         for(int i = n; i<str.length(); i++)
        //         newString += str.charAt(i);            
        // }

        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if("aeiouAEIOU".indexOf(i) != -1){
                ch[i] = '-';
                str = new String(ch);
                break;
            }
        }
        
        return str;
    }

    //Method to count alphabets, digits and special characters in a String.
    public void countChars(String str){
        int alpha = 0, digit =0, special = 0;
        for(int i=0; i<str.length(); i++){
            if(str.matches(".*[a-zA-Z0-9]*."))
                digit++;
            if(str.matches(".*[a-zA-Z].*"))
                alpha++;
            if(str.matches(".*[0-9].*"))
                special++;
        }
        System.out.println("Alphabets : " + alpha);
        System.out.println("Digits : " + digit);
        System.out.println("Special char : " + special);
    }

    public void separateChar(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ')
                System.out.print(str.charAt(i) + " ");
        }
    }

    public String updateString(String str){
        
        char[] ch = str.toCharArray();
        ch[6] = 'e';
        //str = ch.toString(); // Why not? -- Because it will give character value
        // due to conversion between char array to string.
        str = new String(ch);
        return str;
    }
    
    public String removeBlanks(String str){

        char[] ch = str.toCharArray();
        
        for(int i=0; i<str.length()-1; i++){
            if(ch[i] == ' '){
                ch[i+1] = ch[i+2];
                i++;
            }
        }
        str = new String(ch);
       return str;
    }
}
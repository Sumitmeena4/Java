public class Day8 {
    public static void main(String[] arg){

        Strings string = new Strings();
        String str = "Sifra";
        System.out.println(str.length());

    }
}
class Strings{

    //Method to remove given character.
    protected String removeChar(String str, char ch){
        
        int index =0;
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= ch)
                
            if(str.charAt(i) == ch){
                index = i;
                break;
            }
        }
        for(int i= index; i<str.length(); i++){
            newstr += str.char
        }
        return str;
    }

    //Method to count occurrence of a given char in String.
    public String countOccurrence(String str, char ch){
        return str;
    }

    //Method to check a String is Anagram.
    public String checkAnagram(String str1, String str2){
        return " Not Anagram";
    }
}

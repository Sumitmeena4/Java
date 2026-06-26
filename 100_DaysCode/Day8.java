
import java.util.Arrays;

public class Day8 {
    public static void main(String[] arg){

        Strings string = new Strings();
        String str1 = "Raghu Nandan Sharstri";
       System.out.println(string.highestFrequency(str1));

    }
}
class Strings{

    //Method to remove given character.
    //Time -- O(n^2), Space -- O(n).
    protected String removeChar(String str, char ch){
        
        // String new_str = "";
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) != ch)
        //         new_str += str.charAt(i);
        // }
        // String result = str.replace(String.valueOf(ch),""); //T- O(n), S-O(n).
        // return result;

        //Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch)
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //Method to count occurrence of a given char in String.
    public int countOccurrence(String str, char ch){

        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch)
                count++;
        }
        return count;
    }

    //Method to check a String is Anagram.
    public String checkAnagram(String str1, String str2){
  
        // Time -- O(n log n), Space -- O(n).
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length())
            return "Not Anagram";
        else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();  

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2))
                return "Anagram";
        }         
        return "Not Anagram";
    }

    //Method to find a String is palindrome or not.
    // Time -- O(n), Space O(1).
    public String isPalindrome(String str){

        int n = str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n--))
                return "Not Palindrome";
        }
        return "Is Palindrome";
    }

    //Method to check a given char is vowel or consonant.
    public String vowelOrConsonant(char ch){
        
        // Time -- O(1), Space -- O(1).
        if(!Character.isLetter(ch))
            return "Not an alphabet";
        // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
        // || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

        ch = Character.toLowerCase(ch);
        String result = ("aeiou".indexOf(ch) != -1) ? "Vowel" : "Consonant";

        return result;
    }

    //Method to find given char is digit or not.
    public String isDigit(char ch){

        // String result =  (Character.isDigit(ch))? "Digit" : "Non Digit";

        String result = (ch>='0' && ch<='9')? "Digit" : "Non Digit";

        return result;
    }

    //Method to replace the space with given character.
    public String replaceSpace(String str,char ch){

        // return str.replace(' ',ch);
        
        // String new_str = "";
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) != ' ')
        //         new_str += str.charAt(i);
        //     else 
        //         new_str += ch;
        // }
        // return new_str;

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            sb.append(c == ' '? ch : c);
        }
        return sb.toString();
    }

    public String toLowerCase(String str){

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch>= 'A' && ch<='Z')
                sb.append((char)(ch+32));
            else 
                sb.append(ch);
        }
        return sb.toString();
    }

    public String convertVowel(String str){
        // Time -- O(n), Space -- O(n).

        // String newString = "";
        // for(int i=0; i<str.length(); i++){
        //     if("aeiou".indexOf(str.charAt(i)) != -1){
        //         newString += Character.toUpperCase(str.charAt(i));
        //     }else
        //         newString += str.charAt(i);
        // }
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if("aeious".indexOf(c) != -1)
                result.append(Character.toUpperCase(c));
            else
                result.append(c);
        }
        return result.toString();
    }

    //Method to delete vowels in a given string.
    public String deleteVowel(String str){

        // String newString = "";
        // for(char ch : str.toCharArray()){
        //     if("aeiouAEIOU".indexOf(ch) == -1)
        //         newString += ch;
        // }

        // We can also use replaceAll("AEIOUaeiou","").
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if("aeiousAEIOU".indexOf(ch) != -1)
                sb.append(ch);
        }
        return sb.toString();
    }

    //Count Vowel and Consonant in a string.
    public int countVowel(String str){

        int vowel = 0;
        for(int i=0; i<str.length(); i++){
            if("aeiouAEIOU".indexOf(str.charAt(i)) != -1)
                vowel++;
        }
        return vowel;
    }

    //Method to find higest frequency character in a string.
    public char highestFrequency(String str){

        // Time -- O(n^2), Space -- O(1).
        int max = 0;
        char result = str.charAt(0);

        for(int i=0; i<str.length(); i++){
            int count =1;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    count ++;
            }
            if(count>max){
                max = count;
                result = str.charAt(i);
            }
        }
        return result;
    }
}

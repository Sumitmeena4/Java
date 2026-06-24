
import java.util.Arrays;

public class Day8 {
    public static void main(String[] arg){

        Strings string = new Strings();
        String str1 = "Raghu Nandan Shastri";
       string.countVowel(str1);

    }
}
class Strings{

    //Method to remove given character.
    //Time -- O(n), Space -- O(1).
    protected String removeChar(String str, char ch){
        
        String new_str = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch)
                new_str += str.charAt(i);
        }
        return new_str;
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
  
        Arrays.sort(str1.toCharArray());
        Arrays.sort(str2.toCharArray());  
        if(str1.equals(str2)){
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

        // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
        // || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

        if("aeiousAEIOU".indexOf(ch) != -1)
            return "Vowel";

        return "Consonant";
    }

    //Method to find given char is digit or not.
    public String isDigit(char ch){

        if("1234567890".indexOf(ch) != -1)
            return "Digit";

        return "Non Digit";
    }

    //Method to replace the space with given character.
    public String replaceSpace(String str,char ch){

        String new_str = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ')
                new_str += str.charAt(i);
            else 
                new_str += ch;
        }
        return new_str;
    }

    public String toLowerCase(String str){
        return str.toLowerCase();
    }

    public String convertVowel(String str){

        String newString = "";
        for(int i=0; i<str.length(); i++){
            if("aeiou".indexOf(str.charAt(i)) != -1){
                switch(str.charAt(i)){
                    case 'a' : newString += 'A';
                        break;
                    case 'e' : newString += 'E';
                        break;
                    case 'i' : newString += 'I';
                        break;
                    case 'o' : newString += 'O';
                        break;
                    case 'u' : newString += 'U';
                        break;
                }
            }else
                newString += str.charAt(i);
        }
        return newString;
    }

    //Method to delete vowels in a given string.
    public String deleteVowel(String str){

        String newString = "";
        for(int i=0; i<str.length(); i++){
            if("aeiouAEIOU".indexOf(str.charAt(i)) == -1){
                newString += str.charAt(i);
            }
        }
        return newString;
    }

    //Count Vowel and Consonant in a string.
    public void countVowel(String str){

        int vowel = 0, consonant = 0;
        for(int i=0; i<str.length(); i++){
            if("aeiouAEIOU".indexOf(str.charAt(i)) != -1)
                vowel++;

            else if(str.charAt(i) != ' ') 
                consonant++;
        }
        System.out.println("Vowels : " + vowel + " , and Consonants : " + consonant);
    }

    //Method to find the char who has higest frequency.
    public char highestFrequency(String str){
        return ' ';
    }
}

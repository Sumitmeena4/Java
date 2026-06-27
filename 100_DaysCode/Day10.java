public class Day10 {
    public static void main(String[] arg){

        Conditional condi = new Conditional();
        System.out.println(condi.vowelOrConst('O'));
    }
}
class Conditional{
    
    public String EvenOdd(int n){
        String result = (n%2 == 0) ? "Even" : "Odd";
        return result;
    }

    public String leapYear(int year){

        String result = ((year%4 == 0 && year%100 != 0) || year%400 ==0) ? "Leap Year" : "Not a Leap Year";
        return result;
    }

    public String alphabet(char ch){
        String result = Character.isAlphabetic(ch)? "Is Alphabet" : "Not an alphabet";
        return result;
    }

    public String checkNum(int n){
        String result = (n>0)? "Positive" : ((n==0)? "Zero" : "Negative");
        return result;
    }
    
    public String checkLetter(char ch){
        String result = (Character.isLowerCase(ch))? "LowerCase" : "UpperCase";
        return result;
    }

    public String vowelOrConst(char ch){
        return ("aeiou".contains(Character.toString(ch).toLowerCase()))? "Vowel" : "Consonant";
    }
}

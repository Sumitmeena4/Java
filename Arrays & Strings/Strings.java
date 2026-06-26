import java.lang.StringBuilder;

public class Strings {
    public static void main(String[] args) {
        // Strings are Immutable.

       String name = "Sumit Meena"; // Stored in String pool
        System.err.println(reverse(name));
      
    }
    public static void printVowel(String str){
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)== 'a' || str.charAt(i) =='e' ||str.charAt(i) =='i'|| str.charAt(i) =='o'||str.charAt(i) =='u'){
                System.out.println(str.charAt(i) + " Vowel");
            } 
        }
    }
    public static void printLetters(String str){
        for(int i =0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static String substring(String str, int si, int ei){
       String substr = "";
       for(int i=si; i<ei; i++){
        substr += str.charAt(i);
       }
       return substr;
    }
   
    public static String reverse(String name){
        // char[] arr = name.toCharArray();
        // int n = arr.length;
        // for(int i =0; i<n/2;i++){
        //     char temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }
        //     return arr;
        return new 
        StringBuilder(name).reverse().toString();
    }
}
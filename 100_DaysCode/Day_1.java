class Day_1{
    public static void main(String[] a){

        NumSystem var = new NumSystem();
        
        System.out.println(var.IsPalindrome(4567));
    }
}

class NumSystem{
    
    int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + n%10;
            n /= 10;
        }
        return rev;
    }

    public int IsArmstrong(int n){
        // An armstrong number is number that is equal to the sum of its digit,
        // each raised to the power of no of digits in that number.

        int result = 0;
        int dig = String.valueOf(Math.abs(n)).length(); // count the number of digits
        // int dig = (n == 0)? 1 : (int) Math.log10(Math.abs(n)) + 1; // Faster

            /*  while(num>0){
                dig++;
                num /= 10;
            } */

        while(n>0){
            int d = n%10;
            result += Math.pow(d, dig);
            n /=10;
        }
        return result;
    }

    String IsPrime(int n){

        if(n ==1)
            return "Not Prime";

        else{
            for(int i=2; i<n; i++){
                if(n%i==0)
                    return "Not Prime";
        }
        
        }
        return "Prime";
    }

    void Fibonacci(int n){
        // Is a series which is sum of previous two digits, default values are 0,1, ----

        long a = 0, b = 1;
        System.out.print(a);

        for(int i=1; i<n; i++){
            long c = a+b;
            a = b;
            b = c;
            System.out.print(" " + a);
        }
    }

    String IsPalindrome(int n){

        int num = n; 
        int rev = 0;
        while(num>0){
            rev = rev*10 + (num%10);
            num /= 10;
        } 
        String res = (rev == n) ? "Palindrome" : "Not Palindrome";

        return res;
    }
}
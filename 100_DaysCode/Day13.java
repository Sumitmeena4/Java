public class Day13 {
    public static void main(String[] arg){

        Day13 obj = new Day13();
        obj.printArmstrong(500);
    }

    int productOfDigits(int n){

        int prod = 1;
        while(n !=0){
            prod *= n%10;
            n /= 10;
        }
        return prod;
    }

    int reverse(int n){
        int rev =0;
        // while(n!=0){
        //     rev = rev * 10 + n%10;
        //     n /= 10;
        // }
        for(;n>0; n/=10){
            rev = rev*10 + n%10;
        }
        return rev;
    }

    int power(int n, int pow){

        int result = 1;
        while(pow-->0){
            result *= n;
        }
        return result;
    }

    int factorial(int n){

        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }

    String isArmstrong(int n){

        int num = n;
        int dig = String.valueOf(Math.abs(n)).length();
        int result = 0;
        while(n>0){
            int d = n%10;
            result += Math.pow(d,dig);
            n /=10;
        }
        return (result == num)? "Armstrong" : "Not Armstrong";
    }

    void printArmstrong(int n){

        for(int i=1; i<=n; i++){
            int num = i;
            int dig = String.valueOf(Math.abs(num)).length();
            int result = 0;
            while(num>0){
                int d = num%10;
                result += Math.pow(d, dig);
                num/=10;
            }
            if(result == i)
                System.out.print(i + " ");
        }
    }
}

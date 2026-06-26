import java.util.Scanner;
public class Day_3 {
    public static void main(String[] arg){

        Class cls = new Class();
        cls.nPrime(30);
    }
}

class Class{
    // By Using XOR Operator
    int addWithoutPlus(int a, int b){
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    String PerfectNum(int n){
        // A perfect number is equal to the sum of its proper divisors(excluding the number itself).

        int sum = 0;
        for(int i=1; i<n/2; i++){
            if(n%i == 0)
                sum += i;
        }
        String result = sum == n? "Perfect" : " Not perfect";
        
        return result;
    }

    double average(int n){
            
        Scanner s = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter " + n + " numbers ");
        for(int i=1; i<=n; i++){
            sum += s.nextInt();
        }
        double avg = (double) sum /n;

        return avg;
    }

    int factorial(int n){

        int fact = 1;
        for(int i=1; i<=n; i++)
            fact *= i;

        return fact;
    }

    String EvenOdd(int n){

        return n%2 == 0 ? "Even" : "Odd";
    }

    void nPrime(int n){

        int count = 0;
        int num = 2;

        while(count<n){
            boolean isPrime = true;

            for(int i= 2; i<=Math.sqrt(num); i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(num + " ");
                count ++;
            }    
                num ++;
        }
    }
}

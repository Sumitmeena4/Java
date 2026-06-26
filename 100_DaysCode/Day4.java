public class Day4{
    public static void main(String[] args){
        
        MathFunction function = new MathFunction();
        System.out.println(function.cubeRoot(125));
    }
}
class MathFunction{

    void PrimeInRange(int a, int b){
       
        while(a<=b){

            boolean isPrime = true;
            if(a<2)
                isPrime = false;
            
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i == 0)
                    isPrime = false;
            }
                if(isPrime){
                    System.out.print(a + " ");
                }
                a++;
        }
            
    }

    int Smallest(int a, int b, int c){
        
        // int result;

        // if(a<b)
        //     result = (a<c) ? a : c;
        // else
        //     result = (b<c) ? b : c;

        //int result = a<b? (a<c) ? a : c : (b<c) ? b : c;

        int result = Math.min(a, Math.min(b,c));

        return result;
    }

    double PowFunction(int a, int b){

        double result = Math.pow(a,b);
        return result;
    }

    int power(int a, int b){

        int result = 1;
        // while(b-->0)
        //     result *= a;

        // Using binary exponentiation
        
        while(b>0){

            if((b&1) == 1)
                result *= a;

            a *= a;
            b >>=1;
        }

        return result;
    }

    int square(int n){
        int sqr = n * n;
        return sqr;
    }

    long cube(long n){
        return n*n*n;
    }
    
    double squareRoot(int n){
        double result = Math.sqrt(n);
        return result;
    }

    double cubeRoot(int n){
        double result = Math.cbrt(n);
        return result;
    }
}
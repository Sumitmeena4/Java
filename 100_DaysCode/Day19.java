public class Day19 {
    public static void main(String[] arg){

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

public class Day_2 {
    public static void main(String [] arg){

        CheckNumbers check = new CheckNumbers();
        check.primeFactor(60);
    }
}

class CheckNumbers{

    int greatest(int a, int b, int c){
        int largest = (a>b)? ((a>c) ? a : c) : (b>c)? b : c;
        return largest;
    }

    String IsBinary(int n){

        while(n>0){
            if(n%10 != 1 || n%10 != 0)
                return "Not Binary"; 
            n /=10;  
        }
        
        return "Binary";
    }

    void swapNum(int a, int b){
        a += b;
        b = a - b;
        a -= b;

        System.out.println(a + " " + b);

    }
    void swapNum(int a, int b, int c){
        
        a = a + b + c;
        c = a - (b+c);
        b = a - (b+c);
        a -= (b+c);

        System.out.println(a + " " + b + " " + c);
    }

    void primeFactor(int n){

        // int i = 2;
        // while(n>1){

        //     if(n%i == 0){
        //         System.out.print( i + " ");
        //         n/=i;
        //     }
        //     else
        //         i++;
        // }

        // Optimized Code
        for(int i=2; i*i<=n; i++){

            while(n%i == 0){
                System.out.print(i + " ");
                n/=i;
            }
        }
        // If n is still greater than 1, then n itself is a prime factor.
        if(n>1)
            System.out.print(n);
    }
}

public class Day_3 {
    public static void main(String[] arg){

        Class cls = new Class();
        cls.nPrime(7);
    }
}

class Class{

    String addWithoutPlus(int a, int b){

        return "";
    }

    String PerfectNum(int n){
        
        return "";
    }

    double average(int a, int b, double c){
        double avg = (a+b+c)/3;
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

        for(int i=2; i<50; i++){
            for(int j = 2; j<i; j++){
                if(i%j == 0)
                    break;
                else{
                    System.out.print(i + " ");
                    break;
                }
    
            }
        }
    }
}

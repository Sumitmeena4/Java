public class Day5 {
    public static void main(String[] args) {
        AdvNumeric adv = new AdvNumeric();
        System.out.println(adv.calcSI(50000,2,1));
    }
}

class AdvNumeric{

    public int findLCM(int a, int b){

        int div = 2;
        int lcm = 1;
        
        // brute force approach to find the LCM (least common factor).
        while((a != 1) || (b != 1)){
                if(a%div==0 && b%div == 0){
                a /= div;
                b /= div;
                lcm *= div;
            }
            else if(a%div == 0){
                a /= div;
                lcm *= div;
            }
            else if(b%div == 0){
                b /= div;
                lcm *= div;
            }
            else 
                div ++;
        }
        return lcm;
    }

    int findHCF(int a, int b){
        
        int HCF = 1;
        int div = 2;
       // HCF = (a*b)/ findLCM(a,b);    // by calling the LCM function using the formula

       // Brute force approach to find HCF (Highest common factor).
       while(a!= 1 || b!= 1){
            if(a%div == 0 && b %div == 0){
                HCF *= div;
                a /= div;
                b /= div;
            }
            else if(a%div == 0)
                a /= div;

            else if(b%div == 0)
                b /= div;

            else 
                div ++;
        }
        return HCF;
    }

    int toBinary(int n){

        int bin = 0;
        while(n != 1 || n != 0){
            
            if(n%2 == 0){
                bin = bin*10 + 0;
                n /= 2;
            }
            else{
                bin = bin *10 + 1;
                n /= 2;
            }
        }

        return bin;
    }

    String leapYear(int year){
        if((year%400 == 0 && year % 100 != 0) || (year%4 == 0))
            return "Leap Year";

        return "Not a Leap Year";
    }

    int toCelsius(int temp){
        int celsius = (temp-32) * 5/9;

        return celsius;
    }
    
    int toFahrenheit(int temp){
        return (temp * 9/5) + 32;
    }

    int calcSI(int principal, int rate, int time){
        return (principal * rate * time)/100;
    }
}

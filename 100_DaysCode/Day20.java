public class Day20 {
    public static void main(String[] arg){

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

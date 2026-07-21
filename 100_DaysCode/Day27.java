import java.util.Scanner;

class Day27{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NPrimeNo(n);
    }
    
        public static void CheckArmstrong(int num){
        int original = num;
        int count =0;
        int sum =0;
        while(num != 0){
            num /= 10;
            count++;
        }
        num = original;
        while(num!=0){
            int digit = num%10;
                sum += (int) Math.pow(digit, count);
                num/=10;
        }
        if(sum==original)
        System.out.println("The number is Armstrong number");
    else 
        System.out.println("Is not Armstrong number");
    }

    public static int Fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        for(int i=1; i<n;i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(b + " ");

        }
        return 0;
    }
    
    public static void NPrimeNo(int n){
        int count = 0;
        int num =1;
        while(count<n){
            int i = 1;
            if(num%i++==0){
                continue;
            }else{
                System.out.print(num + " ");
                count++;
            }
            num ++;
        }
    }
}
import java.util.*;

class Mini_Project_Basics {
    public static void main(String args[]){
        System.out.println("Hello User, Welcome the world of JAVA");
        System.out.println("Enter the number \n 1 Calulation \n 2 Number Aanlyzer \n 3 Printing Patterns \n 4 Exit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1: Calculator();
            case 2: Number_Analyzer();
            case 3: Print_Patterns();
            case 4: Exit();
        }
        sc.close();
    }
    public static void Calculator(){
        System.out.println("Enter two integers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter the operation no, for add(1), sub(2), mult(3), div(4)");
        char ch = sc.next().charAt(0);

            switch (ch){
                case 1: System.out.println(x-y);
                case 2: System.out.println(x-y);
                case 3: System.out.println(x*y);
                case 4: System.out.println(x/y);
                default : System.out.println("Enter a valid operator no");
            }
    }
    public static void Number_Analyzer(){
        System.out.println("Enter the number to analyze");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0)
        System.out.print("The number is EVEN");
        else
        System.out.print("The number is ODD");

        if (num>=0)
        System.out.println(" and Positive");
        else 
        System.out.println("and Negative");
    }
    public static void Print_Patterns(){

    }
    public static void Exit(){
        System.out.println("Thankyou! Have a Nice day");
    }
    
}
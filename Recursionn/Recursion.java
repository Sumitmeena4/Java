package Recursionn;

public class Recursion{
    // Main method
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    // method to print Decending order from n - 1.
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    // method to print Ascending order from 1 - n.
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // method to find factorial using recursion.
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fn = n* fact(n-1);
        return fn;
    }
    // method to print sum of N numbers.
    public static int sumofNno(int n){
        if(n==1){
            return 1;
        }
        int Sum = n + sumofNno(n-1);
        return Sum;
    }
    // method to print fibonacci series till n number.
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib = fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    
}
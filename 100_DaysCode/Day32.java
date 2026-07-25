public class Day32 {
    public static void main(String [] arg){
        new A(2,3); // Anonumous object, can't use twice.
    }
}

class A {
    public A (int a, int b){
        System.out.println(a+b);
    }
}
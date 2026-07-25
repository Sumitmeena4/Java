public class Day31 {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

class A {

    public A(){
        super(); // Each parent class call an object class.
        System.out.println("in method A");
    }
    public A(int n){
        super(); // Every time a parent class extends Object class.
        System.out.println("in int A");
    }
}
class B extends A {

    public B(){
        super(); // This super will automatically been called, just like default constructor.
        System.out.println("in constructor B");
    }
    public B(int n){
        super(n); // We can also define it at give parameters.
        System.out.println("in int B");
    }
}
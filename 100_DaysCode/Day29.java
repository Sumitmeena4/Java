public class Day29{
    public static void main(String args[]){
        // Pen p1 = new Pen(); //Created a pen object 
        // p1.setColor("Orange");
        // System.out.println(p1.color);
        // p1.setTip(4);
        // System.out.println(p1.tip);
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();

    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
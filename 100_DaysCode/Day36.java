public class Day36 {
    public static void main(String[] arg){
        Car car = new RR();
        car.model();
        car.price();
        Car.drive();

    }
}

abstract class Car{

    public abstract void model();
    public abstract void price();

    public static void drive(){
        System.out.println("Drive the car...");
    }
}
class RR extends Car{
    public void model(){
        System.out.println("Rolls-Royce");
    }
    public void price(){
        System.out.println("$ " + 10000);
    }
}
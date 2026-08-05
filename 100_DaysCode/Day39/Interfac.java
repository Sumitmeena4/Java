


interface Flower{
    //The methods in interface are by default public abstract.
    void name();
    void color();
    void fragrance();
}
@FunctionalInterface
interface Features {

    void season();
}

class SunFlower implements Flower,Features{

    @Override
    public void name(){
        System.out.println("Sunflower");
    }
    @Override
    public void color(){
        System.out.println("Yello and black in color ");
    }
    @Override
    public void fragrance(){
        System.out.println("smell like Honeyed sweetness..");
    }

   
    @Override
    public void season(){
        System.out.println("Can grow in Spring and Summer season...");
    }
}

public class Interfac {
    public static void main(String[] arg){
        Features flower = () -> System.out.println("Grow in Spring and Summer");
        flower.season();
        
    }
}

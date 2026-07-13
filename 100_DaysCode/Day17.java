public class Day17 {
    public static void main(String[] arg){

        OOP oops = new OOP();
        System.out.println(oops.getName());
    }
}

class OOP{

    int id;
    String name = "Sumit";

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

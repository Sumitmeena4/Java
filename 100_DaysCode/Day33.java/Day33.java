public class Day33 {
    public static void main(String[] arg){
        AdvCalc obj = new AdvCalc();
        int result = obj.add(4,5);
        System.out.println(result);
    }
}

class Calc{

    public int add(int n1, int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc {

    // Method Overriding
    @Override
    public int add(int n1, int n2){
        return n1+n2+4;
    }
}
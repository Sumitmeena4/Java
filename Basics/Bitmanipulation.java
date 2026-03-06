
public class Bitmanipulation{
    public static void main(String[] args) {
        // getithbit(7, 2);
        // evenorodd(7);
        // System.out.println(setithbit(13, 1));
        System.out.println(clearithbit(15, 3));
    }
    
    public static void evenorodd(int n){
        int bit = 1;
        if((n & bit)==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void getithbit(int n,int i){
        if((n & (1<<i)) == 0){
            System.out.println("ith bit is 0");
        }else {
            System.out.println("ith bit is 1");
        }
    }
    public static int setithbit(int n, int i){
        int bit = 1<<i;
        return n|bit;
    }
    public static int clearithbit(int n, int i){
        int bit = ~(1<<i);
        return n & bit;
    }
}
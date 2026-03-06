
public class Bitmani2{
    public static void main(String[] arg){
        System.out.println(fastexpo(5,2));
    }
    public static int fastexpo(int a, int n){
        int ans = 1;
        
        while(n>0){
            if((n & 1) !=0){    //check LSB
                ans *= a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
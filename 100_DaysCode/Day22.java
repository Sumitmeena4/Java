public class Day22 {
    public static void main(String[] arg){
        rightHalfParamid(5);
    }
    
    static void rightHalfParamid(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void leftHalfParamid(int n){

        
    }
}

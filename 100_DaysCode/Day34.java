public class Day34 {
    public static void main(String[] arg){
        hourGlassPattern(7);
    }
    protected static void hourGlassPattern(int n){
        for(int i=1; i<=n; i++){
            
             if(n/2+1 >= i){
                for(int j=1; j<=i-1; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=n/2+2-i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i-n/2; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

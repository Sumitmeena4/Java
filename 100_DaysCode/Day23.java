public class Day23 {
    public static void main(String[] arg){
        invertedRHPar(7);
    }

    static void fullParamid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedRHPar(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedLHParamid(int n){
        for(int i=n; i>=1; i--){
            while(n-i !=0){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
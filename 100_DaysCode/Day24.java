class Day24{
    public static void main(String[] arg){
        diamondPattern(9);
    }

    static void invertedFullPyramid(int n){
        for(int i=n; i>=1; i--){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void rhombusPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondPattern(int n){
        for(int i=1; i<=n; i++){
            if(i<=n/2+1){
                for(int j=1; j<=n/2+1-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }else
            {
                for(int j=n/2; j>n-i; j--){
                    System.out.print(" ");
                }
                for(int k=1; k<=n-(i-1); k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
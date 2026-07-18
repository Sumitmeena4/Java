class Day24{
    public static void main(String[] arg){
        invertedFullParamid(8);
    }

    static void invertedFullParamid(int n){
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
}
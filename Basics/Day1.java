public class Day1 {
    public static void main(String args[]){
        int num = 25;
        int rem = num;
        for(int i=2; i<num; i++){
            while(rem%i==0){
                System.out.print(i + " ");
                rem = num/i;
            }
        }
    }
}

public class Day12 {
    public static void main(String[] arg){
        
        Day12 obj = new Day12();
        obj.findDigit(7563002);
    }

    public void printAlpha(){

        char ch = 'a';
        for(int i=1; i<=26; i++){
            System.out.print(ch++ + " ");
        }
    }

    public void printASCII(){
        // char ch = 'A';
        for(int i=30; i<=130; i++){
            System.out.print(i + "-" +  (char)(i) + "  ");
        }
    }

    public int swapDigit(int n){

        int res = n%10;
        n /= 10;
        int mid = 0;
        while(n>=9){
            mid = mid*10 +  n%10;
            n/=10;
        }
        while(mid !=0){
            res = res*10 + mid%10;
            mid/=10;
        }
        res = res*10 + n;
        return res;
    }

    public int sumOfDigit(int n){

        int no1 = n%10;
        while(n>=9){
            n/=10;
        }
        int sum = no1 + n;
        return sum;
    }

    public void findDigit(int n){
        
        int last = n%10;
        while(n>=9){
            n/=10;
        }
        System.out.println("First : " + n + ", " + "Last : " + last);
    }
}

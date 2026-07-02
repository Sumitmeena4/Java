public class Day14 {
    public static void main(String[] arg){
        Day14 obj = new Day14();
        System.out.println(obj.isWord('a'));
    }

    public int compoundIntrest(int amount, int time){
        return 0;
    }

    public String isPrime(int n){
        if(n<1)
            return "Not Prime";
            
        else{
            for(int i=2; i<n; i++){
                if(n%i == 0)
                    return "Not prime";
            }
        }
        return "Prime";
    }

    public String isWord(char ch){

        String result = ((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))? "Character" : "Not a Char";
        return result;
    }
}

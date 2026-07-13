public class Day18 {
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,3,5,5,5,5,4,1,9};
        System.out.println(highestFreq(arr));
    }

    static int highestFreq(int[] arr){
        int[] freq = new int[256];

        for(int i=0; i<arr.length; i++){
                freq[arr[i]]++;
        }
        int highest = freq[arr[0]];
        int high = arr[0];
        for(int i= 0; i<arr.length; i++){
            if(freq[arr[i]] > highest){
                highest = freq[arr[i]];
                high = arr[i];
            }
        }
        return high;
    }
}
public class Day21 {
    public static void main(String[] arg){

    }
       protected String compareArrays(int[] arr1, int[] arr2){

        int size1 = arr1.length;
        int size2 = arr2.length;

        String equality = (size1==size2)? "Have Equal size" : "Not Equal";

        return equality;
    }

    public  void LargestAndSmallest(int[] arr){

        int smallest = arr[0];
        int largest = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(largest < arr[i])
                largest = arr[i];

            if(smallest > arr[i])
                smallest = arr[i];
        }
        System.out.println("Largest in array is : " + largest);
        System.out.println("Smallest in array is : " + smallest);
    }

    protected int secondHighest(int[] arr){
        int highest = arr[0];
        int secondHighest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>highest){
                secondHighest = highest;
                highest = arr[i];
            }
            else if(arr[i]>secondHighest)
                secondHighest = arr[i];
        }
        return secondHighest;
    }

    public int[] top2Max(int[] arr){

        int top1 = arr[0];
        int top2 = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>top1){
                top2 = top1;
                top1 = arr[i];
            }
            else if(arr[i]>top2)
                top2 = arr[i];
        }
        return new int[] {top1,top2};
    }

    protected int[] reverseArray(int[] arr){

        int end = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }

        return arr;
    }
}

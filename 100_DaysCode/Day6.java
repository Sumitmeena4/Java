import java.util.Arrays;
public class Day6 {
    public static void main(String[] arg){

        int[] arr = {1,2,2,4,4,3,2,2,6};

        Array array = new Array();
        for(int n : array.removeDuplicate(arr)){
            System.out.print(n + " ");
        }
    }
}
class Array{

    //Method to find the missing number from 1-n;
    public int findMissing(int arr[]){
        // To find the missing number, we will use the formula of sum of total number.
        // Sum of n num = n*(n+1)/2.
        // Time complexity -- O(n), Space complexity -- O(1).

        int n = arr.length;
        int total_sum = 0;
        int expected_sum = n*(n+1)/2;

        for(int i=0; i<n; i++){
            total_sum += arr[i];
        }
        int missingNum =expected_sum - total_sum;

        return missingNum;
    }

    //Method to find Duplicate values in an array.
    public void findDuplicate(int arr[]){
        //Brute force approach
        // Time Complexity -- O(n^2), Space -- O(1).

        /*for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
        */

        // Using sorting
        // Time com -- O(n log n), Space -- O(1).

        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1])
                System.out.print(arr[i] + " ");

            while(i<arr.length-1 && arr[i] == arr[i+1]) //The condition will not print repeatative duplicates.
                i++;
        }
    }

    //Method to find first Duplicate in an array.
    public int firstDuplicate(int arr[]){
        
        // Brute force approach
        // Time complexity -- O(n^2), Space -- O(1).        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.print("Duplicate of index " + i + " at index " + j + " is ");
        //             return arr[i];
        //         }    
        //     }
        // }

        // Using Sorting
        // Time -- O(n log n), Space -- O(1)

        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1])
                return arr[i];
        }
        return -1; // No duplicate found.
    }

    //Method to remove the duplicates form array.
    public int[] removeDuplicate(int arr[]){

        int k = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(arr[i] == arr[j]){
        //             arr[j] = 0;
        //             size++;
        //         }
        //     }
        // }
         int arr2[] = new int[arr.length];
        // int k = 0;
        // for(int i = 0; i<n; i++){
        //     if(arr[i] != 0)
        //         arr2[k] = arr[i];
        //     k++;
        // }

        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!= arr[i-1])
                arr2[k++] = arr[i];
        }
        return arr2;
    }

    private int checkMatch(int[] arr1, int[] arr2){

        for(int i=0; i<arr1.length; i++){
        boolean found = false;

            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found)
                return arr1[i];
        }
        return 0;
    }
}
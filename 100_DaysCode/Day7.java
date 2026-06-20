import java.util.Scanner;

public class Day7 {
    public static void main(String[] arg){

        int[] arr = {2,3,4,6,8,3,9};

        Array2 array2 = new Array2();
        for(int n: array2.insertElement(arr)){
            System.out.print(n + " ");
        }
    }
}
class Array2{

    public int[] revIn2Way(int[] arr){
        return arr;
    }

   //Method to insert the element at the end in array.
    protected int[] insertElement(int[] arr){

        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println("Enter the element ");
        arr2[arr.length] = sc.nextInt();
        sc.close();
        return arr2;
   }

   //Method to insert element to the given location.
   protected int[] insertAtLocation(int[] arr, int index){

    Scanner sc = new Scanner(System.in);
    arr[index] = sc.nextInt();
    sc.close();
    return arr;
   }

   //Method to delete last element from array.
   int[] deleteLastElement(int[] arr){

    // By creating new Array.
    // Time -- O(n), Space O(n).
    int[] arr2 = new int[arr.length-1];
    for(int i=0; i<arr2.length; i++)
            arr2[i] = arr[i];
    return arr2;

    // By reducing the length of array
    // reduce the length of array by 1 and print elements from 0 to length.
    // Time -- O(1), Space -- O(1).
   }

   //Method to delete the given element form the array.
   int[] deleteGivenElement(int[] arr, int element){

    //By creating new Array
    //Time -- O(n), Space -- O(n).
    // int[] arr2 = new int[arr.length-1];
    // for(int i=0,k=0; i<arr.length; i++){
    //     if(arr[i] != element)
    //         arr2[k++] = arr[i];
    // }
    // return arr2;


    //By shifting elements
    //Time -- O(n),Space -- O(1).
    int n = arr.length; 
    int index = -1; //Index of given element.
    for(int i=0; i<n; i++){
        if(arr[i] == element){
            index = i; 
            break;
        }   
    }
    if(index != -1){
            for(int i=index; i<n-1; i++){
            arr[i] = arr[i+1];
        }
    }
    return arr;
   }


}

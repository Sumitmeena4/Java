import java.util.ArrayList;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] arg){

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {10,11,12,14};
        
        Array2 array2 = new Array2();   // variable creation of type Class(Array2).

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
   public int[] deleteLastElement(int[] arr){

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
   public int[] deleteGivenElement(int[] arr, int element){

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

   //Method to delete the index element from given array.
   public int[] deleteAtIndex(int[] arr, int index){

    // int[] arr2 = new int[arr.length-1];
    // for(int i=0,k=0; i<arr.length; i++){
    //     if(index != i){
    //         arr2[k++] = arr[i];
    //     }
    // }

    for(int i=index; i<arr.length-1; i++){
        arr[i] = arr[i+1];
    }
    
    return arr;
   }

   //Method to find the sum of an array.
   public int calculateSum(int[] arr){

    int sum = 0;
    for(int n : arr){
        sum += n;
    }
    return sum;
   }

   //Method to print all the even in given array.
    public ArrayList<Integer> EvenInArray(int[] arr){

    ArrayList <Integer> list = new ArrayList<>();
    for(int n : arr){
        if(n%2 == 0){
            list.add(n);
        }
    }
    return list;

    // int[] arr2 = new int[arr.length];
    // int count =0;
    // for(int n : arr){
    //     if(n%2==0)
    //         arr2[count++] = n;
    // }
    // for(int i=0; i<count; i++){
    //     System.out.print(arr2[i] + " ");
    // }    
   }

   //Method to print all Odd in an array.
   public ArrayList<Integer> OddInArray(int[] arr){

    ArrayList<Integer> list = new ArrayList<>();
    for(int n : arr){
        if(n%2!=0)
            list.add(n);
    }
    return list;
   }

   //Method to perform left rotation by 2 positions.
   protected int[] leftRotation(int[] arr){

    for(int i=0; i<arr.length-3; i+=2){
        int temp = arr[i];
        arr[i] = arr[i+2];
        arr[i+2] = temp;

        temp = arr[i+1];
        arr[i+1] = arr[i+3];
        arr[i+3] = temp;
    }

    return arr;
   }

   //Method to perform right rotation by 2 positions.
   protected int[] rightRotation(int[] arr){

    for(int i=arr.length-1; i>2; i-=2){
        int temp = arr[i];
        arr[i] = arr[i-2];
        arr[i-2] = temp;
        
        temp = arr[i-1];
        arr[i-1] = arr[i-3];
        arr[i-3] = temp;
    }
    return arr;
   }

   //Method to merge two arrays.
   protected ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2){
    // int[] merged = new int[arr1.length + arr2.length];
    // int i=0;
    // for(int n: arr1){
    //     merged[i++] = n;
    // }
    // for(int n : arr2){
    //     merged[i++] = n;
    // }
    // return merged;

    ArrayList<Integer> list = new ArrayList<>();
    for(int n : arr1){
        list.add(n);
    }
    for(int n: arr2){
        list.add(n);
    }
    return list;
   }
}

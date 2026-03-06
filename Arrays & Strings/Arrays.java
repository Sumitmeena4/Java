import java.util.*;

class Arrays{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {4,6,33,21,5,1};
    reverseArray(arr);
  }
  public static void reverseArray(int arr[]){
    for(int i =0; i<arr.length/2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - i -1];
      arr[arr.length -i-1] = temp;
    }
    for(int num : arr){
      System.out.print(num + " ");
    }
  }
  public static void minmax(int arr[]){
    int max = arr[0];
    int min = arr[0];
    for(int i = 0; i< arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("Max value in array is : " + max); 
    System.out.println("Min value in array is : " + min);   
  }
  public static int sum(int arr[]){
    int sum =0;
    for(int i = 0; i<arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  public static void evenOdd(int arr[]){
    int even =0, odd = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]%2 == 0){
        even++;
      }else{
        odd++;
      }
    }
    System.out.println("Even's count : " + even);
    System.out.println("Odd's count : " + odd);
  }
}
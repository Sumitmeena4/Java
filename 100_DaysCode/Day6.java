public class Day6 {
    public static void main(String[] arg){

        int arr[] = {2,3,4,3,2,8,1,5,9,1};
        Array array = new Array();
        System.out.println(array.firstDuplicate(arr));
    }
}
class Array{

    public int findMissing(int arr[]){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                return i;
        }

        return 0;
    }

    public void findDuplicate(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

    int firstDuplicate(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print("Duplicate of index " + i + " at index " + j + " is ");
                    return arr[i];
                }    
            }
        }
        return 0;
    }
}

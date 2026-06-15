import java.util.ArrayList;

class Arraylists{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //Get operation
        int element = list.get(2);
        System.out.println(element);
        list.remove(3);
        System.out.println(list);
        list.set(2,2);
        System.out.println(list);
        list.contains(2);
        
    }
}
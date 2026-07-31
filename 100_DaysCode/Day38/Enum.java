package Day38;

enum Status{
    completed, pending, inProgress, notAssigned;
}


public class Enum{
    public static void main(String[] arg){
        Status s = Status.completed;

        EnumSwitch swt = new EnumSwitch();
        swt.getStatus(s);

        // System.out.println(s);

        // Status[] all = Status.values();     // .values is array type, so we have to initialize the array.

        // // Print all the member from the enum Status.
        // for(Status ss : all){
        //     System.out.println(ss + " : " + ss.ordinal());    // .ordinal give the index values.
        // }
    }
}
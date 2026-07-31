package Day38;

public class EnumSwitch {

    EnumSwitch(){
            System.out.println("In consturctor....");
        }

        static void getStatus(Status s){

        switch(s){

            case completed:
                System.out.println("Task has been completed..");
                break;

            case pending:
                System.out.println("Task is pending..");
                break;

            case inProgress:
                System.out.println("Task is in progress..");
                break;

            case notAssigned:
                System.out.println("Task not assigned...");
                break;
        }
    }
}

package Day37;

public class Day37 {
    public static void main(String[] arg){

        Books book = new Books();
        NoteBook note = new NoteBook();
        book.read();
        note.read();
        book.learn();
        book.learn("English");
        note.write();
    }
}

    /* Can polymorphism is possible without inheritance ?
    
        Yes, we can achieve Compile time polymorphism (Method overloading)
        without inheritance. However, Run time polymorphism(Method overriding)
        requires inheritance(or interface) because it is achieved through method
        overriding, where subclass provide its own implimentation of a parent class
        or interface method. */

class Books{

    public void read(){
        System.out.println("Can read from book...");
    }
    public void learn(){
        System.out.println("Can learn new concepts from book...");
    }
    public void learn(String sub){
        System.out.println("Lean " + sub + " from book..");
    }
}
class NoteBook{

    public void write(){
        System.out.println("Can write in Notebook...");
    }
    public void read(){
        System.out.println("Can read from Notebook...");
    }
}
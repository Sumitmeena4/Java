
class OOPS2{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "Srijan";

        Student s2 = new Student();
        System.err.println(s2.schoolname);        
    }
}
class Student {
    String name;
    int roll;
    static String schoolname;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("In all Eight Directions");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("In all Eight Direction (by one Step)");
    }
}

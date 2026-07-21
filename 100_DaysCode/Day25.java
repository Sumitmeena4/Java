public class Day25 {
    public static void main(String[] arg){
        
        Student std = new Student();
        System.out.println(std.setId(4));
    }
}

class Student{

    int id;
    String name;
    static String prof;

    public Student()
    {
        name = "sumit";
        prof = "student";
    }

    public String getName(){
        return name;
    }
    
    public int setId(int id){
        this.id = id;
        return id;
    }
    public int getId(){
        return id;
    }
    public String getProf(){
        return prof;
    }
}
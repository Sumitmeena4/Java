public class Day11 {
    public static void main(String[] arg){
        Day11 obj = new Day11();
        System.out.println(obj.eligibleForEngineering(69,"Maths"));
    }

    public String findType(char ch){

        if(Character.isAlphabetic(ch))
            return "Alphabet";

        else if(Character.isDigit(ch))
            return "Digit";

        return "Special Character";
    }

    public String dayName(int day){
        switch(day){
            case 1: 
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6: 
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid number";
        }
    }

    public String checkEquality(int a, int b){
        return (a==b)? "Equal" : "Not equal";
    }

    public String eligibleToVote(int age){
        return (age>=18)? "Eligible" : "Not eligible";
    }

    public String eligibleForEngineering(int per, String sub){
        if(per>=70 && sub.equals("Maths")){
            return "eligible";
        }
        return "Not Eligible";
    }

    public int DaysInMonth(int month){
        switch(month){
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default : return 0;
        }
    }

    public void countNotes(int amount){
        int fiveHundred = 0;
        int twohundred = 0;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
    }

    public void formTriangle(){
        
    }
}

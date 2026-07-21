public class Day26 {
    public static void main(String[] args){
        Encapsulation en = new Encapsulation();
        System.out.println(en.withdraw(60000));
    }
}

class Encapsulation{

    private String holderName;
    private double balance;
    private String type;

    Encapsulation(){
        holderName = "Sumit";
        balance = 50_000;
        type = "saving";
    }

    public void details(){
        System.out.println("Name : " + holderName);
        System.out.println("Balance : " + balance);
        System.out.println("Account type : " + type);
    }

    public double get_balance(){
        System.out.print("Your balance is Rs ");
        return balance;
    }

    public double deposit(double amount){
        this.balance += amount;
        System.out.print("Available balance ");
        return balance;
    }

    public double withdraw(double amount){
        if(balance >= amount){
            this.balance -= amount;
            System.out.println("withdrawal of amount rs " + amount + " from your account");
            System.out.print("Available balance : ");
            return balance;
        }else
        {
            System.out.println("Insufficent amount in your account");
            System.out.print("Available balance Rs ");
        }
        return balance;
    }
}
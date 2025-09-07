import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to ExpenseTracker");
        
        Transaction myTransac = new Transaction(15.30, "Compra en el chino", 350,new Date());
        
        System.out.println(myTransac.toString());
    }
}
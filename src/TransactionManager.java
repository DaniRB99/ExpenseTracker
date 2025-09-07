import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager(){
        this.transactions = new ArrayList<>();
    }

    //CRUD
    //TODO: Default values
    //FIXME: fuck
    public void updateTransaction(Integer index, String description, double amount, double balance, Date transactionDate){
        Transaction transacUpd = this.transactions.get(index);
        //TODO:SETTERSSSSSS
    }

    public void newTransaction(double amount, String desc, double balance, Date transacDate){
        this.transactions.add(new Transaction(amount, desc, balance, transacDate));
    }

    public Transaction searchTransaction(String desc){
        Transaction transacFound = null;
        for (Transaction transac : transactions){
            if (transac.getDescription().equals(desc)){
                transacFound = transac;
            }
        }
        return transacFound;
    }

    public Transaction removeTransaction(Integer index){
        Transaction transacRemoved = null;
        try{
            transacRemoved = this.transactions.get(index);
            if (!this.transactions.remove(index)){
                transacRemoved = null;
            }
        } catch (IndexOutOfBoundsException ignored) { }
        return transacRemoved;
    }
}

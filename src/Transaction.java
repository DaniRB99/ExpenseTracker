import java.util.Date;

public class Transaction {
    private double amount;
    private String description;
    private double balance;
    private Date transacDate;
    private Date timestamp;

    //NEW TRANSACTION
    public Transaction(double amount, String desc, double balance, Date transacDate) {
        this.amount = amount;
        this.description = desc;
        this.balance = balance;
        this.transacDate = transacDate;
        this.timestamp = new Date();
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTransacBalance() {
        return this.balance;
    }

    public void setTransacBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Date getTransacDate() {
        return this.transacDate;
    }

    public void setTransacDate(Date transacDate) {
        this.transacDate = transacDate;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    //TODO: format date
    @Override
    public String toString(){
        return String.format("%s: %.2f€ (%s) balance(%.2f€)",this.description,this.amount, this.transacDate.toString(), this.balance);
    }

}

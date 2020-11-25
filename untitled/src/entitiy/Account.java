package entitiy;

public class Account {
    public String accNo;
    public String name;
    public double balance;

    public Account(){}

    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }


    public String toString() {
        return "Account No: " + this.accNo + "\nName: " + this.name + "\nBalance: " + this.balance + "\n";
    }
}

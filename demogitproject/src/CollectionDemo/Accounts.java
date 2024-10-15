package CollectionDemo;

public class Accounts 
{
    int Accountno;
    double balance;

    public int getAccountno() {
        return Accountno;
    }

    public void setAccountno(int accountno) {
        Accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Accounts(int accountno, double balance) 
    {
        Accountno = accountno;
        this.balance = balance;
    }
}

package Esercizio1;
public class BankAccount implements Comparable {
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {   
        deposit(initialBalance);
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException();
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (amount > balance || amount <= 0)
            throw new IllegalArgumentException();
        balance = balance - amount;
    }

    public void transfer(double amount, BankAccount other)
    { 
        withdraw(amount);
        other.deposit(amount);
    }


    // ------- metodi di accesso --------

    public double getBalance()
    {   
        return balance;
    }


    // ------ metodi di Object da sovrascrivere ---------
    // ......... toString e equals ......................
    public String toString(){
        return "Balance: "+balance;
    }

    public boolean equals(BankAccount b){
        return balance==b.balance;
    }



    // -------- campi di esemplare ---------

    private double balance;

    public int compareTo(Object other) {
        BankAccount o = (BankAccount) other;
        if (balance < o.balance)
            return -1;
        if (balance > o.balance)
            return 1;
        return 0;
    }
}
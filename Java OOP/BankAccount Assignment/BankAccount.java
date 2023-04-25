

public class BankAccount{
    private double balance = 0;
    // private int accountsCode;
    private static int accountsNum =0;
    private static double allBalance = 0;


    public BankAccount(){
        BankAccount.accountsNum +=1;
    }
    public double checkingBalance(){
        return this.balance;
    }
    public void savingsBalance(double balance){
        this.balance = balance;
        BankAccount.allBalance += balance;
    }

    public void addMoney(double money){
        this.balance += money;
        BankAccount.allBalance += money;
    }
    public void withdrawMoney(double money){
        if(money < this.balance){
            this.balance -= money;
            BankAccount.allBalance -= money;
        }else{
            BankAccount.noMoney();
        }
    }
    private static void  noMoney(){
        System.out.println("you don't have enough money please withdraw less money");
    }

    public static void printStaticInfo(){
        System.out.println(accountsNum);
        System.out.println(allBalance);
    }

}
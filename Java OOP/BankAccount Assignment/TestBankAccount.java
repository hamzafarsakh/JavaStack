public class TestBankAccount{
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();
        bankAccount1.addMoney(56.5);
        bankAccount1.withdrawMoney(1);
        System.out.println(bankAccount1.checkingBalance());
        BankAccount.printStaticInfo();
    }
}
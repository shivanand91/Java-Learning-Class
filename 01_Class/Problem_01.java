class Account{
    public String accountHolderName;
    public String accountNumber;
    public double accountBalance;

    public static void printResult(){
        System.out.println("Account Holder Name: "+ this.accountHolderName);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Account Balance: "+ this.accountBalance);
    }

    public static void Account(String a, String b, double c){
        this.accountHolderName = a;
        this.accountNumber = b;
        this.accountBalance = c;
    }
}

public class Problem_01{
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.accountHolderName = "Shivanand kumar";
        a1.accountNumber = "39934854059";
        a1.accountBalance = 455467;

        a1.printResult();

        // System.out.println("Account Holder Name: "+ a1.accountHolderName);
        // System.out.println("Account Number: "+ a1.accountNumber);
        // System.out.println("Account Balance: "+ a1.accountBalance);

    }
}
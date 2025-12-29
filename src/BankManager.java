import java.util.Scanner;

public class BankManager {
//    create a static scanner here instead of passing it to each function
 static Scanner sc = new Scanner(System.in);
    public static void main() {
        double initial_balance = 2000;
        boolean is_running = true;
        System.out.println("hi");
        do {


            System.out.println("hi.Welcome to our bank\n1.Show balance\n2.Deposit\n3.Withdraw\n4.Exit\n Pls enter 1,2,3 or 4 according to your choice");

            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("here;s your balance : " + initial_balance);
                    System.out.println("--------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("pls enter the money to deposit");
                    initial_balance = Deposit(initial_balance);
                }
                case 3 -> {
                    System.out.println("pls enter the money to withdraw");
                    initial_balance = Withdraw(initial_balance);
                }
                case 4 -> {
                    System.out.println("exiting..");
                    is_running = false;
                }
                default -> System.out.println("pls enter a valid choice");


            }
        }while (is_running);

    }
    public static double Deposit(double balance){
        double amt_to_add = sc.nextDouble();
        balance += amt_to_add;
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Amount %f deposited in your account.\n" , amt_to_add);
        System.out.println("--------------------------------------------------------------");
        return balance;

    }
    public static double Withdraw(double balance){
        double amt_to_reduce = sc.nextDouble();
        if (amt_to_reduce == balance || balance <=100|| (balance-amt_to_reduce) <100) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Minimum Balance of 100 rupees is required to keep in the Account. Check Your Balance to verify.");
            System.out.println("--------------------------------------------------------------");
            return balance;
        }
        else if (amt_to_reduce > balance  ){
            System.out.println("--------------------------------------------------------------");
            System.out.println("Not enough balance in your account. Check Your Balance to verify.");
            System.out.println("--------------------------------------------------------------");
            return balance;
        }
        balance -= amt_to_reduce;
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Amount %f withdrawn from your account. Check Your Balance to verify.\n" , amt_to_reduce);
        System.out.println("--------------------------------------------------------------");

        return balance;

    }
}

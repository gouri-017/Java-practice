import java.util.Scanner;

public class BankManager {
    public static void main() {
        double initial_balance = 2000;
        boolean cont = true;
        System.out.println("hi");
        do {


            System.out.println("hi.Welcome to our bank\n1.Show balance\n2.Deposit\n3.Withdraw\n4.Exit\n Pls enter 1,2,3 or 4 according to your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> System.out.println("here;s your balance : " + initial_balance);
                case 2 -> {
                    System.out.println("pls enter the money to deposit");
                    Deposit();
                }
                case 3 -> {
                    System.out.println("pls enter the money to withdraw");
                    Withdraw();
                }
                case 4 -> {
                    System.out.println("exiting..");
                    cont = false;
                }
                default -> System.out.println("pls enter a valid choice");


            }
        }while (cont);

    }
    public static void Deposit(){

    }
    public static void Withdraw(){

    }
}

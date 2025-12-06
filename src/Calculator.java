import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b;

        char operation = 'y';
        do {
            System.out.println("please enter two numbers.");
            if (sc.hasNextDouble())
                 a = sc.nextDouble();
            else{
            System.out.println("please enter valid input.");
            sc.next();
            continue;
            }
            if (sc.hasNextDouble())
                b = sc.nextDouble();
            else{
                System.out.println("please enter valid input.");
                sc.next();
                continue;
            }
            System.out.println("please choose the operation to perform -: +, -, *, / ('q' to exit): ");
            operation = sc.next().charAt(0);
            switch (operation){
                case '+' -> add(a,b);
                case '-' -> subtract(a,b);
                case '*' -> mul(a,b);
                case '/' -> divide(a,b);
                case 'q','Q' -> {
                    operation = 'q';
                    continue;
                }
                default -> System.out.println("Invalid Operation. Either choose again or press 'q' to exit.");
            }
        } while (operation != 'q');





    }
    static void add(double a, double b) {
        System.out.println("Sum: "+(a+b));
    }
    static void subtract(double a, double b){
        System.out.println("subtraction: " + (a-b));
    }

    static void mul(double a, double b){
        System.out.println("multiply : "+ (a*b));
    }

    static void divide(double a, double b) {
        if (b == 0){
            System.out.println("Error.Cannot divide by zero.");
            return;
        }
        System.out.println("divide: "+(a/b));
    }

}

import java.util.Scanner;

public class Calculator {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double a,b;
        boolean keepgoing = true;

        char operation;
        do {
            System.out.println("press 'q' at any stage to terminate the program.");
            System.out.println("Enter the first number.");
            if (sc.hasNextDouble())
                 a = sc.nextDouble();
            else{
                char ch = sc.next().charAt(0);
                if (ch == 'q' || ch == 'Q') {
                    System.out.println("Exiting program...");
                    keepgoing = false;
                    continue;
                } else {
                    System.out.println("please enter valid input.");
                    sc.nextLine();  // clear the rest of the line
                    continue;
                }

            }

            System.out.println("Enter the second number.");
            if (sc.hasNextDouble())
                b = sc.nextDouble();
            else{
                char ch = sc.next().charAt(0);
                if (ch == 'q' || ch == 'Q') {
                    System.out.println("Exiting program...");
                    keepgoing = false;
                    continue;
                } else {
                    System.out.println("please enter valid input.");
                    sc.nextLine();  // clear the rest of the line
                    continue;
                }

            }
            System.out.println("please choose the operation to perform -: +, -, *, /, ^  ('q' to exit): ");
            operation = sc.next().charAt(0);
            switch (operation){
                case '+' -> add(a,b);
                case '-' -> subtract(a,b);
                case '*' -> mul(a,b);

                case '/' -> divide(a,b);
                case 'q','Q' ->{
                    System.out.println("Exiting program...");
                    keepgoing = false;
                }
                case '^' -> power(a,b);
                default -> System.out.println("Invalid Operation. Either choose again or press 'q' to exit.");
            }
        } while (keepgoing);





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
    static void power(double a, double b){
        System.out.println("a to the power of b is: "+ Math.pow(a,b));
    }

    static void divide(double a, double b) {
        if (b == 0){
            System.out.println("Error.Cannot divide by zero.");
            return;
        }
        System.out.println("divide: "+(a/b));
    }


}

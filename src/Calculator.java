import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter two numbers.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        add(a,b);
        subtract(a,b);
        mul(a,b);
        divide(a,b);
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
        System.out.println("divide: "+(a/b));
    }

}

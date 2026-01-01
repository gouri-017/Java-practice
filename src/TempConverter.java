import java.util.Scanner;

public class TempConverter {
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        double temp,converted_temp;
        int ch;
//        System.out.print("jkf");
        System.out.print("How do you wanna Proceed?\n 1. Change temperature from Fahrenheit to Celsius\n 2. Change temperature from Celsius to Fahrenheit ---- Enter your choice 1/2 \n : ");
        ch = sc.nextInt();
        switch (ch){
            case 1 -> {
                System.out.print("Enter the temperature in Fahrenheit: ");
                temp = sc.nextDouble();
                converted_temp = (temp - 32) * 5 / 9 ;
                System.out.println(converted_temp + "°C");
            }
            case 2 -> {
                System.out.print("Enter the temperature in Celsius: ");
                temp = sc.nextDouble();
                converted_temp = (temp  * 1.8 ) + 32 ;
                System.out.println(converted_temp + "°F");

            }
        }



    }
}

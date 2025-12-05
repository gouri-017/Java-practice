import java.util.Scanner;
public class randomprogram{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        char choice;
        int strike = 3;

        do {
            System.out.println("welcome Lets play a game.");
            System.out.print("Answer in y/n if y then give answer in one word or type n to Quit. Ok?\n Y/N: ");
            choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                break;
            else  {
                System.out.println("congratulation for choosing to play. you made the right Choice\n       Lets start\n");
                strike = pastry(sc,strike);
                System.out.println("please enter your name: ");
                String name = sc.next();
                System.out.println("congratulations on completing Round 1 "+name+". You have "+ strike+"/3 strikes left.");
            }
        } while (choice == 'y' || choice == 'Y');




    }
    static int pastry(Scanner sc, int strike){
        System.out.println("Do you like Pastries?\n Y/N: ");
        char ch = sc.next().charAt(0);
        int i=1;
        switch (ch){
            case 'y','Y' -> System.out.println("very good. Lets go to round 2 :-) ");
            case 'n','N' ->{
                System.out.println("Hm. That's strike "+i+" (You have "+(strike-(i++))+" more strikes left.)");
                strike--;

            }
            default -> System.out.println("please enter correct choice.(you cannot quit now, you had a chance.)");
        }
        return strike;
    }
}


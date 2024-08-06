
import java.util.Scanner;
public class useOfLogicaloprators{
    public static void main(String []args ){
        Scanner input =new Scanner(System.in);
        System.out.println("** Welcome to Ticket discount calculator **\n\n");
        System.out.print("Enter your age :");
        int age = input.nextInt();
        System.out.print("Enter your gender (false for male and true for female):");
        boolean gender = input.nextBoolean();
        if(age<10){

            System.out.println("You are eligible for 75% discount");
        }
        else if(gender)
        {
            System.out.println("You are eligible for 50% discount");
        }
        else if(age>=60&&!gender){
            System.out.println("You are eligible for 25% discount");
        }
        else{
            System.out.println("You are not eligible for any discount");
        }
        System.out.println("\n\nThanks for using our system.");

    }
}
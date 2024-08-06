import java.util.Scanner;


 public class firstProblemOfcondinal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Welcome to the Driving license portal ** ");
        System.out.print("Enter Your Age :");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for driving license");
        }
        else
        {
            System.out.println("You are not eligible for driving license");
        }
        System.out.println("Thank you for using our portal.");
    }
}
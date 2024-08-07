
import java.util.Scanner;
public class useOfBitwiseOprator{
    public static void main(String[]args ){
        System.out.println(" Welcome to number system program ");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number one :");
        int num=input.nextInt();
        System.out.print("Enter number Two :");
        int num1=input.nextInt();
        //int result =num&num1;
        System.out.println(" The Result of Bitwise and Use : "+(num&num1));
        System.out.println(" The Result of Bitwise OR Use : "+(num|num1));
        System.out.println(" The Result of Bitwise XOR Use : "+(num^num1));
        System.out.print("enter number for checking complement of number :");
        int num2=input.nextInt();
        System.out.println(" The Result of Bitwise Complement Use : "+(~num2));
        System.out.println(" The Result of Bitwise  Left shift Use : "+(num2>>2));
        System.out.println(" The Result of Bitwise  Right shift Use : "+(num1<<3));

    }
}
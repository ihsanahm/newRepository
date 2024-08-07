
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

    }
}

import java.util.Scanner;
public class evenOdd{
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("The Even Number :"+num);
        }
        else{
            System.out.println("The Odd Number :"+num);
        }

    }
}

import java.util.Scanner;
public class leapYear{
    public static void main(String[]args){
        System.out.println("Welcome to year checker application ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year=sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0))
        {
            System.out.println("Your year is leap year.");
        }
        else{
            System.out.println("Your year is not leap year.");
        }
        System.out.println("THanks for using our Application.");

    }
}

import java.util.Scanner;
public class numbers{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=input.nextInt();
        if(num<0){
            System.out.println("The Negative Number : "+num);
        }
        else if(num>0){
            System.out.println("The Positive Number : "+num);

        }
        else{
            System.out.println("The Zero Number : "+num);
        }
    }
}
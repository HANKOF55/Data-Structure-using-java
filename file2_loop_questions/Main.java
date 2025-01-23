import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int orignal_x = x;

        int count = 0; 
        while(orignal_x != 0){
            orignal_x = orignal_x/10;
            count++;
        }

        System.out.println("The number of digits in " + x + " is: " + count);
    }
}
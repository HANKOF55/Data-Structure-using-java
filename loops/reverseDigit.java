import java.util.Scanner;

public class reverseDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse it : ");
        int n = sc.nextInt();
        int copy_n = n , rev = 0; 

        while(copy_n != 0){
            rev = (rev*10) + (copy_n % 10);
            copy_n /= 10;
        }

        System.out.println("The reverse of " + n + " is : " + rev);
    }
}

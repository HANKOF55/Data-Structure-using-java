import java.util.Scanner;

public class addDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int copy_n = n, ans = 0 , digits = 0;

        int i = 1;

        while(copy_n > 0 ){

            digits = copy_n%10;
            ans += digits;
            copy_n /= 10;
            i++;
            
        }

        System.out.println("The sum of number of digits in " + n + " is : " + ans);

        

    }
}
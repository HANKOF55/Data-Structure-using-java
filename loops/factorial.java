import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        int ans = 1; 

        for(int i = 1; i<=n; i++){
            ans *= i;
            System.out.println("The factorial of " + i + " is : " + ans);
        }

    }
}
import java.util.Scanner;

public class factorial{

    static int factorial(int n){
        //Base case
        if(n==1){
            return 1;
        }

        int smallerProblem = factorial(n-1);
        return n*smallerProblem;

    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number for factorial : ");
        int n = sc.nextInt();

        int ans = factorial(n);

        System.out.println("Factorial of " + n + " is : " + ans); 

    }
}
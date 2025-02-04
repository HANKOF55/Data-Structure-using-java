import java.util.Scanner;


public class printcounting {

    static void printNnum(int n){
        //Base Case
        if(n==1){
            System.out.println(1);
            return;
        }


        printNnum(n-1);
        System.out.println(n);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n number : ");
        int n = sc.nextInt();

        System.out.println();
        printNnum(n);

    }
}
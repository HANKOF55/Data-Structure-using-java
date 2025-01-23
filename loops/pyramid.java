import java.util.Scanner;

public class pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();

        for(int i=0 ; i<r ; i++){
            for(int s =i ; s<(r-1) ; s++){
                System.out.print("  ");
            }
            for(int n=0; n<=i ; n++){
                System.out.print("* ");
            }
            for(int m=1; m<=i ; m++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
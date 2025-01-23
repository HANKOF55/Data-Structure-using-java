import java.util.Scanner;

public class numberMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();

        for(int i=1 ; i<=r ; i++){
            for(int n=i ; n<=r ; n++){
                System.out.print(n + " ");
            }
            for(int m=1 ; m<i; m++){
                System.out.print(m + " ");
            }
            System.out.println();
        }


    }
}
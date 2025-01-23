import java.util.Scanner;

public class numberPyramid{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();

        for(int i=1 ; i<=r ; i++){
            for(int s=i; s<r ; s++){
                System.out.print("  ");
            }
            for(int n=1 ; n<=i ; n++){
                System.out.print(n+" ");
            }
            for(int m=i-1 ; m>0 ; m--){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
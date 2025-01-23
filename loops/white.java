import java.util.Scanner;

public class white {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x= 0;
        int ans = 0 ; 

        while(x != -1){
            System.out.print("Enter a number : "); 
            x = sc.nextInt();
            ans += x;
        }

        System.out.println(ans);

    }

}
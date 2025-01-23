import java.util.Scanner;

public class alternateAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int ans = 0;

        for(int copy_n = n; copy_n != 0; copy_n--){
            if(copy_n % 2 == 0 ){
                ans -= copy_n;
            }
            else{
                ans += copy_n;
            }
        }

        // for(int copy_n = n ; copy_n != 0 ; copy_n /= 10){
        //     if(copy_n % 2 == 0){
        //         ans -= copy_n%10;
        //     }
        //     else{
        //         ans += copy_n%10;
        //     }
        // }

        System.out.println("Answer is : " + ans);

    }
}
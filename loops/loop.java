import java.util.Scanner;

class loop{
    public static void main(String[] args){

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = 0; 
        int y = 0 ;
        while(y < x){
            ans = ans + y;
            y += 1; 
        }

        System.out.println("Sun of " + x + " natural number is : " + ans);

    


    }
}
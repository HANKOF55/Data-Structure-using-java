import java.util.Scanner;

class Alzebra{
    int add(int a, int b){
            return a+b;
    }

}


public class Main{
    public static void main(String[] args) {
     
        Alzebra obj1 = new Alzebra();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int sum = obj1.add(a,b);
        System.out.println("The sum of a and b is : " + sum);
    }
}
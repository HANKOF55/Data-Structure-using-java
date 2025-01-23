import java.util.Scanner;

public class matrixsum{

    static int[][] createTwoDMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[r][c];

        System.out.println("Enter Elements : ");

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    static int getSum(int[][] matrix, int r1, int c1, int r2, int c2){
        int sum = 0 ; 

        r1 -= 1;
        r2 -= 1;
        c1 -= 1; 
        c2 -= 1;

        for(int i=r1; r1<=r2 ; r1++){
            for(int j=c1 ; c1<=c2 ; c1++){
                sum += matrix[i][j];
            }
        }

        return sum; 

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and column : ");
        
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] matrix = createTwoDMatrix(r,c);

        System.out.print("Enter the first cordinates : ");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        
        System.out.print("Enter the second cordinates : ");
        int r2=sc.nextInt();
        int c2= sc.nextInt();

        int ans = getSum(matrix,r1,c1,r2,c2);

        System.out.println("The sum is : " + ans );

    }
}
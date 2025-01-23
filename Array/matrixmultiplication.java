import java.util.Scanner;

public class matrixmultiplication {
    
    static void getMatrixInput(int[][] arr){
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static int[][] mutiplyMatrix(int[][] arr1, int[][] arr2){

        int n = arr1.length;
        int m = arr2[0].length;
        int[][] ansMatrix = new int[n][m];

        for(int i=0 ; i<arr2[i].length ; i++){
         
            for(int k=0 ; k<arr2[i].length ; k++){

                for(int j=0 ; j<arr2.length ; j++){
                     ansMatrix[i][k] += (arr1[i][j]* arr2[j][k]) ;
                }
            }
        }

        return ansMatrix;

    }

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the row and column of matrix 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1];

        System.out.print("\n");
        getMatrixInput(matrix1);

        System.out.println("\n");

        System.out.println("Enter the row and column of matrix 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int [][]matrix2 = new int[r2][c2];

        System.out.print("\n");

        getMatrixInput(matrix2);

        int[][] ansMatrix = 
        
        mutiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplicaiton of matrix1 and matrix 2 is : ");
        printMatrix(ansMatrix);




    }
}
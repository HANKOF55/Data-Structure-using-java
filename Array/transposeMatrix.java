import java.util.Scanner;

public class transposeMatrix {

    static int[][] createTwoDMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column of matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] newMatrix = new int[r1][c1];

        System.out.println("Enter Elements : ");

        for(int i=0 ; i<newMatrix.length ; i++){
            for(int j=0 ; j<newMatrix[i].length ; j++){
                newMatrix[i][j] = sc.nextInt();
            }
        }

        return newMatrix;
    }

    static void transposeSwap(int[][] matrix){

        for(int r1=0 ; r1<matrix.length-1 ; r1++){
            for(int c1=r1 ; c1<matrix[r1].length ; c1++){
                int t = matrix[r1][c1];
                matrix[r1][c1] = matrix[c1][r1];
                matrix[c1][r1] = t;
            }
        }

    }

    static int[][] transposeNewMatrix(int[][] matrix){

        int r2 = matrix[0].length;
        int c2 = matrix.length;

        int[][] newMatrix = new int[r2][c2];

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;

    }

    static int[][] rotateMatrix(int[][] arr){
        
        if(arr.length == arr[0].length){
            transposeSwap(arr);
        }else{
            arr = transposeNewMatrix(arr);
        } 

        int ansarr[][] = new int[arr.length][arr[0].length];

        System.out.println(arr.length);
        for(int r=0 ; r<arr.length ; r++){
            int start = 0;
            int end = arr[r].length-1;
            while(start<end){
                ansarr[r][start] = arr[r][end];
                ansarr[r][end] = arr[r][start];
                start++;
                end--;
            }
        }

        return ansarr;

    }

    static void printTwoDArr(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = createTwoDMatrix();
        // int[][] ansMatrix = transposeNewMatrix(matrix1); 
        
        int[][] ansarr = rotateMatrix(matrix1);

        System.out.println("The transpose matrix is : ");
        printTwoDArr(ansarr);

    }
}
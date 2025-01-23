import java.util.Scanner;

public class spiralmatrix {

    static int[][] createTwoDMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);

        int[][] newMatrix = new int[r][c];

        System.out.println("Enter elements : ");
        
        for(int i=0 ; i<newMatrix.length ; i++){
            for(int j=0 ; j<newMatrix[i].length ; j++){
                newMatrix[i][j] = sc.nextInt();
            }
        }
        
        return newMatrix;
    }

    static void printSpiralElement(int[][] arr){
        
        int n= arr.length, m=arr[0].length;
        int count = 0;
        int tr=0 , sc=0 , ec=m-1 , br=n-1;

        while(count < (n*m)){
            for(int j=sc ; j<=ec && count < (n*m) ; j++){
                System.out.print(arr[tr][j]+" ");
                count++;
            }
            tr++;
            for(int i=tr ; i<=br && count < (n*m) ; i++){
                System.out.print(arr[i][ec] + " ");
                count++;
            }  
            ec--;
            for(int j=ec ; j>=sc && count < (n*m) ; j--){
                System.out.print(arr[br][j] + " ");
                count++;
            } 
            br--;
            for(int i=br ; i>=tr && count < (n*m) ; i--){
                System.out.print(arr[i][sc] + " ");
                count++;
            }
            sc++;
        }

    }

    static int[][] createSpiralMatrix(int n){
        int[][] ansmatrix= new int[n][n];

        int tr=0 , br=n-1, lc=0, rc=n-1;

        int count = 1; 

        while(count <= n*n){
            for(int j=lc ; j<=rc && count<= (n*n) ;j++){
                ansmatrix[tr][j] = count;
                count++;
            }
            tr++;
            for(int i=tr ; i<=br && count<=(n*n) ; i++){
                ansmatrix[i][rc] = count;
                count++;
            }
            rc--;
            for(int j=rc ; j>=lc && count<=(n*n) ; j--){
                ansmatrix[br][j] = count;
                count++;
            }
            br--;
            for(int i=br ; i>=tr && count<=(n*n) ; i--){
                ansmatrix[i][lc] = count;
                count++;
            }
            lc++;
        }


        return ansmatrix;
    }

    static void printTwoDMatrix(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number of rows and column : ");
        // int r = sc.nextInt();
        // int c = sc.nextInt();

        // int[][] ansarr = createTwoDMatrix(r,c);

        // printSpiralElement(ansarr);


        System.out.print("Enter the number for square spiral matrix : ");

        int n = sc.nextInt();

        int[][] ansMatrix = createSpiralMatrix(n);

        System.out.println("2d Spiral matrix : ");
        printTwoDMatrix(ansMatrix);
        System.out.println("Matrix spiral element : ");
        printSpiralElement(ansMatrix);
        

    }
}
import java.util.Scanner;


public class pascaltri {

    static void pascalTriangle(int n){
        
        int[][] ansarr = new int[n][n];
        
        for(int r=0 ; r<n ; r++){
            for(int c=0 ; c<=r ; c++){
                
                if(c==0 || c==r){
                    ansarr[r][c] = 1;
                } 
                else{

                    ansarr[r][c] = ansarr[r-1][c-1] + ansarr[r-1][c];
                }
            }
        }
        
        printPascalArr(ansarr, n);

    }

    static void printPascalArr(int[][] arr, int n){
        for(int r=0 ; r<n ; r++){
            for(int i=r ; i<n ;i++){
                System.out.print(" ");
            }
            for(int c=0 ; c<=r ; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    
    static void pascalJaggedArray(int n){

        int[][] ansarr= new int[n][];

        for(int r=0 ; r<n ; r++){
            ansarr[r] = new int[r+1];
            ansarr[r][0] = ansarr[r][r] = 1;
            for(int c=1 ; c<r ; c++){
                ansarr[r][c] = ansarr[r-1][c-1] + ansarr[r-1][c];
            }

        }

        printPascalArr(ansarr, n);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        pascalJaggedArray(n);

    }
}
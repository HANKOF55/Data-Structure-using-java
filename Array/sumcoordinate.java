import java.util.Scanner;

public class sumcoordinate {

    static int[][] TwoDPrefix(int[][] matrix){

        int r1 = matrix.length, c1=matrix[0].length;

        int[][] prefixMatrix = new int[r1][c1];

        int prevElement = 0; 

        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                prefixMatrix[i][j] = prevElement + matrix[i][j];
                prevElement = prefixMatrix[i][j];
            }
            prevElement = 0;
        }

        return prefixMatrix; 
    }

    static void prefixColumn(int[][] matrix){

        int r1 = matrix.length, c1=matrix[0].length;

        int prevElement = 0 ; 
        for(int i=0 ; i<matrix[0].length ; i++){
            for(int j=0 ; j<matrix.length ; j++){
                prevElement += matrix[j][i];
                matrix[j][i] = prevElement;
            }
            prevElement = 0; 
        }
    }

    static void findSum(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        int cout = 0 ;

        System.out.print("Enter the number of questions : ");
        int q = sc.nextInt();

        while(cout < q){
            int ans = 0 ;
            int a, b;

            System.out.print("Enter the first coordinates : ");
            int r1 = sc.nextInt() , c1 = sc.nextInt();

            System.out.print("Enter the second coordinates : ");
            int r2 = sc.nextInt(), c2 = sc.nextInt();

            if(r1 == 1 && c1 !=1 ){
                ans = matrix[r2-1][c2-1] - matrix[r2-1][c1-2]; 
            }
            else if(c1 == 1 && r1 != 1){
                ans = matrix[r2-1][c2-1] -matrix[r1-2][c2-1];
            }
            else if(r1 == 1 && c1 == 1){
                ans = matrix[r2-1][c2-1];
            }
            else{
                a = matrix[r1-2][c2-1] - matrix[r1-2][c1-2];
                b = matrix[r2-1][c2-1] - matrix[r2-1][c1-2];
                ans = b-a;
            }

            System.out.println("Sum is : " + ans);

            cout++;

        }
    }

    static int[][] createTwoDMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[r][c];

        System.out.println("Enter elements : ");

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }   
 
    static int sumCoordinate(int[][] arr, int r1, int c1, int r2, int c2){

        int ans = 0; 

        for(int i=r1-1 ; i<=r2-1 ; i++){
            for(int j=c1-1 ; j<=c2-1 ; j++){
                ans += arr[i][j];
            }
        }


        return ans;
    }

    static void qCoordinateSum(int[][] matrix, int q){
        Scanner sc = new Scanner(System.in);
        int count = 0; 

        while(count<q){
            System.out.print("Enter the first coordinates : ");
            int r1 = sc.nextInt(), c1 = sc.nextInt(); 

            System.out.print("Enter the second coordinates : ");
            int r2 = sc.nextInt() , c2 = sc.nextInt();

            int sum = 0 ; 

            for(int i=r1-1 ; i<r2 ; i++){
                
                if(c1==1){
                    sum += matrix[i][c2-1];
                    System.out.println(sum);
                }
                else {
                    sum += (matrix[i][c2-1] - matrix[i][c1-2]);
                    System.out.println(sum);
                }
            }
            
            System.out.println("The sum is : " + sum);

            count++;
        }
    }

    static void printTwoDArray(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of row and columns : ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] matrix = createTwoDMatrix(r,c);

        int[][] preFixMatrix = TwoDPrefix(matrix);

        prefixColumn(preFixMatrix);

        findSum(preFixMatrix);

        // System.out.println("Printing matrix : "); 

        // printTwoDArray(preFixMatrix);

        // System.out.print("Enter the number of coordinates : ");
        // int q = sc.nextInt();

        // qCoordinateSum(preFixMatrix, q);


        

        // System.out.print("Enter the first coordinates : ");
        // int r1=sc.nextInt() , c1= sc.nextInt();

        // System.out.print("Enter the seond coordinates : ");
        // int r2=sc.nextInt(), c2= sc.nextInt();

        // int sum = sumCoordinate(matrix, r1, c1, r2, c2);
        
        // System.out.println("The sum of your coordinates are : " + sum );

    }
}
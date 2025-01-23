import java.util.Scanner;

public class countzero {

    static void findZero(int[] arr){

        
        int countZero = 0 ;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                countZero++;
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            if(i<=(countZero-1)){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

    }

    static void sortzeros(int[] arr){
        int i = 0; 
        int j = arr.length-1;

        while(i<=j){
            if((arr[j]==0) && (arr[i]==1)){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
            else if((arr[i]==1) && (arr[j]==1)){
                j--;
            }
            else if((arr[i]==0) && (arr[j]==0)){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
    }

    static void printArr(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();

        int[] testArr = new int[l];
        
        for(int i=0 ; i<testArr.length ; i++){
            testArr[i] = sc.nextInt();
        }

        // findZero(testArr);
        sortzeros(testArr);
        printArr(testArr);
    }
}
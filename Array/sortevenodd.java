import java.util.Scanner;

public class sortevenodd {

    static void sortNumber(int[] arr){

        int i = 0 ;
        int j = arr.length-1;

        while(i<j){
            if((arr[i]%2 == 0) && (arr[j]%2 != 0)){
                i++;
                j--;
            }
            else if((arr[i]%2 != 0) && (arr[j]%2 == 0)){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
            else if((arr[i]%2 == 0) && (arr[j]%2 ==0)){
                i++;
            }
            else{
                j--;
            }
        }
    }
    
    static void printArr(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
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

        sortNumber(testArr);
        printArr(testArr);


    }
}
import java.util.Scanner;


public class nondecsq {

    static int absolute(int n){
        if(n < 0){
            return -n;
        }else{
            return n;
        }
    }

    static void sortsq(int[] arr){

        int l = arr.length;
        int i=0;
        int j=l-1;

        while(i<=j){
            if(absolute(arr[i]) > absolute(arr[j])){
                arr[i] = arr[i]*arr[i];
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else if(absolute(arr[i]) < absolute(arr[j])){
                arr[i] = arr[i] * arr[i];
                i++;
            }else if(absolute(arr[i]) == absolute(arr[j])){
                // arr[i] = arr[i] * arr[i];
                arr[j] = arr[j] * arr[j];
                // i++;
                j--;
            }


        }

    }

    static void printArr(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int l = sc.nextInt();

        int[] testArr= new int[l];

        System.out.println("Now enter the elements of array -> ");

        for(int i=0 ; i<l ; i++){
            testArr[i] = sc.nextInt();
        }

        sortsq(testArr);       
        printArr(testArr);
    }
}
import java.util.Scanner;


public class rotated {

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    static void rwes(int[] arr, int k){

        int l = arr.length;

        if(k>l){
            k= k%l;
        }

        reverse(arr, 0 , (l-(k+1)));
        reverse(arr, (l-k), l-1); 
        reverse(arr, 0, l-1);

    }

    static int[] rotate(int[] arr, int k){

        int l = arr.length;

        if(k>l){
            k = k%l;
        }

        int[] clonearr = new int[l];
        // int j = l-k;
        int i = 0;

        for(int j=l-k ; j<l ; j++){
            clonearr[i] = arr[j];
            i++;

        }


        for(int j = 0; j<(l-k) ; j++){
            clonearr[i] = arr[j];
            i++;
        }

        return clonearr;
    }

    static void printArr(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + ", " );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] testArr = {1,2,3,4,5,6,7,8,9,23,4,1,2,5};

        System.out.print("Enter the number to rotate array : ");
        int n = sc.nextInt();

        rwes(testArr, n);

        printArr(testArr);



    }
}
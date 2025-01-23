

public class reverse {

    static int[] revArray(int arr[]){

        int cloneArr[] = new int[arr.length];

        int i = arr.length-1;
        int j = 0;
        while(i >= 0){
            cloneArr[j] = arr[i];
            j++;
            i--;
        }

        return cloneArr;
    }

    static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    
    public static void main(String[] args){

        int arr1[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array before reversing.");
        printArr(arr1);
        int newarr[] = revArray(arr1);
        System.out.println("\nArray after reversing.");
        printArr(newarr);


    }
}
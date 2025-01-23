import java.util.Scanner;


public class lastOcc{
    
    // static int lastOcc(int[] arr, int x){
    
    //     for(int i = arr.length-1 ; i>=0 ; i--){
    //         if(arr[i] == x) return i; 
    //     }
    //     return -1; 
    // }

    static String sortedArr(int[] arr){
        
        if(arr[0] < arr[1]){
            
            if(arr[0] < arr[1]){
                for(int i = 0 ; i<arr.length-1; i++){
                    if(!(arr[i] < arr[i+1])){
                        return "Array is not Sorted.";
                    }
                }
            }else{
                for(int i = 0 ; i<arr.length-1; i++){
                    if(!(arr[i] > arr[i+1])){
                        return "Array is not Sorted.";
                    }
                }
            }
        }

        return "Array is Sorted.";
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        
        int []arr = new int[]{5,6,5,3,5,4};

        int arr_2[] = {1,2,4,7,8,9};
        int arr_3[] = {9,6,4,3,2,1};
        int arr_4[] = {1,2,3,4,9,6};
        int arr_5[] = {9,8,7,8,4,2,1};

        
        // System.out.print("Enter x : ");
        // int x = sc.nextInt();        

    //    int i = lastOcc(arr,x);
       
    //    System.out.println("The last occurence of " + x + " is : " + i);

        System.out.println("arr is : " + sortedArr(arr));
        System.out.println("arr_2 is : " + sortedArr(arr_2));
        System.out.println("arr_3 is : " + sortedArr(arr_3));
        System.out.println("arr_4 is : " + sortedArr(arr_4));
        System.out.println("arr_5 is : " + sortedArr(arr_5));

    }
}
import java.util.Scanner;


public class prefixelement {

    static boolean prefixsuffix(int[] arr){

        int sufixprefixArr[] = prefixadd(arr);
        int i=0;
        int j= arr.length-1;
        
        while(i<j){
            if(sufixprefixArr[i] == (sufixprefixArr[j]-sufixprefixArr[i])) return true;
            i++;
        }

        return false;
    }

    static void prefixquerry(int[] arr){
        Scanner sc = new Scanner(System.in);

        prefixadd(arr);
        System.out.print("Enter the number of querries you want to ask : ");
        int query = sc.nextInt();

        int count = 1;
        int ans; 

        while(query >= count){
            System.out.print("Value of l: ");
            int l = sc.nextInt();
            System.out.print("Value of r: ");
            int r = sc.nextInt();

            if(l==1){
                ans = arr[r-1]; 
            }else{
                ans = arr[r-1]-arr[(l-1)-1];
            }

            System.out.println("Sum of elem from " + l + " to " + r + " is : " + ans);
            count++;
        }

    }

    static int[] prefixadd(int[] arr){
        int prevElement = 0;
        int []prefixAarr = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            prefixAarr[i] = arr[i] + prevElement;
            prevElement = prefixAarr[i]; 
        }

        return prefixAarr;
    }

    static void printArr(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void inputArr(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int[] testArr = {1,2,3,4,5,6};

        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int []testArr = new int[l];
        System.out.println("Enter the elements of array : ");

        inputArr(testArr);

       System.out.println("Array before prefixing.");
        printArr(testArr); 

        System.out.println("\n");
        // System.out.println("Array after prefixing.");
        // prefixadd(testArr);
        // printArr(testArr);

        // prefixquerry(testArr);

        boolean istrue = prefixsuffix(testArr);

        if(istrue){
            System.out.println("Equal partition is : True.");
        }else{
            System.out.println("Equal partition is : False.");
        }

    }
}
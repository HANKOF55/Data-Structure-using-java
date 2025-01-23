import java.util.Scanner;

public class freq {
    
    static int[] createArr(int l){
        Scanner sc = new Scanner(System.in);
        int[] newarr = new int[l];

        for(int i=0 ; i<newarr.length ; i++){
            newarr[i] = sc.nextInt();
        }

        return newarr;
    }

    
    static void checkElement(int arr[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of querries you wanted to ask : ");
        int q = sc.nextInt();
        int count = 0;

        int []freqArr = new int[100005];

        for(int i=0 ; i<arr.length ; i++){
            freqArr[arr[i]]++;
        }

        while(count <= q){

            System.out.print("Enter the element you want to check : ");
            int ele = sc.nextInt();
            if(freqArr[ele] > 0){
                System.out.println("Element is present in the array");
            }else{
                System.out.println("Element is not present in the array");
            }
            count++;
            
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of array : ");
        int l = sc.nextInt();

        int[] testarr = createArr(l);

        checkElement(testarr);

    }
}
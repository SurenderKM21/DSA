import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
        print(arr);
        sc.close();    
    }
    public static void print(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void bubbleSort(int[] arr, int n) {
       for(int i=0;i<n-1;i++) // i= 0 TO n-2
       {
         int didSwap = 0;
         for(int j=0;j<n-i-1;j++) 
         {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = 1;
            }
         }
         if(didSwap==0) return; //O(N) - Best case
         System.out.println("Given not in sorted order");
       }
    }

   
}

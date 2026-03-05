import java.util.Scanner;

public class MergeSort {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        print(arr);
        sc.close();    
    }
    private static void mergeSort(int[] arr, int low,int high) {
        if(low==high) 
            return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeSortedArrays(arr,low,mid,high);
    }
    private static void mergeSortedArrays(int[] arr, int low, int mid, int high) {
        int [] temp = new int[high+1];
        int index = 0;

        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while(left<=mid){
            temp[index]=arr[left];
            left++;
            index++;
        }
        while(right<=high){
            temp[index] = arr[right];
            index++;
            right++;
        }
        for(int i=0;i<high+1;i++){
            arr[i] = temp[i]; 
        }

    }
    public static void print(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
}

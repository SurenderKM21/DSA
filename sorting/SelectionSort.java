import java.util.Scanner;
public class SelectionSort{
    
    public static void selectionSort(int[] arr,int n)
    {
        for(int i=0;i<=n-2;i++)
        {
            int mini = i;
            for(int j=i;j<n;j++)
            {
                if(arr[mini] > arr[j]) mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
        print(arr);
        sc.close();
    }
}
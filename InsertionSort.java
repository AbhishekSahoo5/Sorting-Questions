
public class InsertionSort {

    public static int[] insertion_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]={14,9,15,12,6,8,13};
        int arr1[]=insertion_sort(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

// GFG practise link:- "https://www.geeksforgeeks.org/problems/insertion-sort/1"

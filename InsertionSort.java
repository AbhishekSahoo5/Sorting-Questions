
public class InsertionSort {

    public static int[] insertion_sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
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

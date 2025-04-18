
public class BubbleSort {
    public static int[] bubble_sort(int arr[])
    {
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            int flag=0;
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    flag=1;
                }
            }
            if(flag==0){
                break;
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
        int arr[]={13,46,24,52,20,9};
        int arr1[]=bubble_sort(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}

// GFG practise link:- "https://www.geeksforgeeks.org/problems/bubble-sort/1"

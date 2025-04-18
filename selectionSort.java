public class selectionSort{

    public static int[] selection_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            swap(arr,i,min);
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
        int arr1[]=selection_sort(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

//  GFG Practise Link:- "https://www.geeksforgeeks.org/problems/selection-sort/1"
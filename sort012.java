public class sort012 {

    // Approach 1 (By tracking the frequency of 0,1 and 2)
    public static void sort(int arr[])
    {
        int n=arr.length;
        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==0) zeros++;
            else if(arr[i]==1) ones++;
            else twos++;
        }

        int idx=0;
        for(int i=0;i<zeros;i++)
        {
            arr[idx++]=0;
        }
        for(int i=0;i<ones;i++){
            arr[idx++]=1;
        }
        for(int i=0;i<twos;i++)
        {
            arr[idx++]=2;
        }
    }

    // Approach 2: Dutch NATIONAL fLAG Algotithm
    public static void DNF(int arr[])
    {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,1,2,1,2,1,2,0};
        // sort(arr);
        DNF(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}

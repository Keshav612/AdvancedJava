public class SelectionSort 
{
    public static void main(String[] args) 
    {
    int arr[]={2,10,8,7};
    int n=arr.length;
    sort(arr,n);
    }    
    static void sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_ind])
                {
                    min_ind=j;
                }
                int t=arr[min_ind];
                arr[min_ind]=arr[i];
                arr[i]=t;
            }
        }
        for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" ");
    }
    }  
}

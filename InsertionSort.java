public class InsertionSort 
{
    public static void main(String[] args) 
  {
    int arr[]={2,10,8,7};
    int n=arr.length;
    sort(arr,n);
  }  
  static void sort(int arr[],int n)
  {
      
    for(int i=1;i<n;i++)
    {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" ");
    }
  }
    
}

public class BubbleSort 
{
  public static void main(String[] args) 
  {
    int arr[]={2,10,8,7};
    int n=arr.length;
    sort(arr,n);
  }  
  static void sort(int[] arr,int n)
  {
      for(int i=0;i<n;i++)
      {
          boolean swapped=false;
          for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
  
}


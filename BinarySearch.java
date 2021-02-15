public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        int x1=2;
        int x2=9;
        int x3=100;
        System.out.println(BS(a,n,x1));
        System.out.println(BS(a,n,x2));
        System.out.println(BS(a,n,x3));

    }
    static boolean BS(int a[],int n,int x)
    {
        int low=0;int hi=n-1;
        while(low<=hi)
        {
            int mid=(low+hi)/2;
            if(a[mid]==x)
                return true;
            else if(a[mid]>x)
                hi=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
    
}

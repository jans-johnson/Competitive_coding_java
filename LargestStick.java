public class LargestStick {
    static int findMax(int[] arr,int n,int x,int number)
    {
        int i=0;int max=15,mid,count,val=0;
        while(i<max)
        {
            mid=(i+max)/2;
            count=0;
            for(int j=0;j<n;j++)
                count+=arr[j]/mid;
            if(count>=number)
            {
                val=mid;
                i=mid+1;
            }
            else
                max=mid;
            //System.out.println("i"+i+"\nmax"+max+"/ncount"+count+"\nmid"+mid);
        }
        return val;
    }
    public static void main(String[] args) {
        int[] arr={8,10,15};
        int x=findMax(arr,3,7,4);
        System.out.println(x);
    }
}

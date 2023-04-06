package BinarySearch;

public class AggressiveCows {
    
    static boolean satisfies(int dis,int x,int n,int[] arr)
    {
        int cows=x-1,prev=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-prev>=dis)
            {
                cows--;
                prev=arr[i];
                if(cows==0)
                    return true;
            }
        }
        return false;
    }

    static int minimumDistance(int x,int n,int[] arr)
    {
        int max=arr[n-1]-arr[0];
        int i=0,mid,min=0;
        while(i<max)
        {
            mid=(i+max)/2;
            if(satisfies(mid, x, n, arr))
            {
                if(mid>min)
                {
                    min=mid;
                }
                i=mid+1;
            }
            else
                max=mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,7,10};
        System.out.println(minimumDistance(3, 5, arr));
    }
}

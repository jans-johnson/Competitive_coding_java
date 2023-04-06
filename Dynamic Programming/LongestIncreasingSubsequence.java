public class LongestIncreasingSubsequence {
    static int longest(int[] arr,int n)
    {
        int[] lst=new int[n];
        lst[0]=1;
        for(int i=1;i<n;i++)
        {
            lst[i]=1;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i]&&(lst[j]+1)>lst[i])
                    lst[i]=lst[j]+1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            if(lst[i]>max)
                max=lst[i];
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,7,8,12,10,8,9,14,13};
        System.out.println(longest(arr, 11));
    }
}

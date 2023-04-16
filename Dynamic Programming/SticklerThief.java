public class SticklerThief {
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=arr[0];
        if(n>1)
        dp[2]=arr[1];
        for(int i=3;i<=n;i++)
        {
            if((dp[i-2]+arr[i-1])>(dp[i-3]+arr[i-1]))
                dp[i]=dp[i-2]+arr[i-1];
            else
                dp[i]=dp[i-3]+arr[i-1];
        }
        return Integer.max(dp[n],dp[n-1]);
    }
    public static void main(String[] args) {
        int[] arr={5,5,10,100,10,5};
        System.out.println(FindMaxSum(arr, 6));
    }
}

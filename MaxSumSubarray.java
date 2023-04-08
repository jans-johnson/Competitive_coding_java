public class MaxSumSubarray {
    static int maxSum(int[] arr,int n)
    {
        int max_sum=Integer.MIN_VALUE,cur_sum=0;
        for(int i=0;i<n;i++)
        {
            cur_sum+=arr[i];
            if(max_sum<cur_sum)
                max_sum=cur_sum;
            if(cur_sum<0)
                cur_sum=0;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,5,-2,6};
        System.out.println(maxSum(arr,7));
    }
}

public class KnapsackProblem {
    static int knapsack(int[] wt,int[] val,int W,int n)
    {
        int[] arr=new int[W+1];
        for(int i=0;i<n;i++)
        for(int j=W;j>=0;j--)
        {
            if(j>=wt[i])
            {
                arr[j]=Integer.max(arr[j],arr[j-wt[i]]+val[i]);
            }
        }
        return arr[W];
    }
    public static void main(String[] args) {
        int[] wt={1,2,3};
        int[] val={10,15,40};
        System.out.println(knapsack(wt,val,6,3));
    }
}

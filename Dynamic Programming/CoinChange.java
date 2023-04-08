public class CoinChange {

    static int ways(int[] coins,int deno,int val)
    {
        int[] arr=new int[val+1];
        arr[0]=1;
        for(int i=0;i<deno;i++)
        for(int j=coins[i];j<=val;j++)
        {
            arr[j]+=arr[j-coins[i]];
        }
        return arr[val];
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        System.out.println(ways(coins,3,5));    
    }
}

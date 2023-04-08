package Recursion;

public class CoinChange {
    static int ways(int[] coins,int deno,int val)
    {
        if(val==0)
            return 1;
        else if(val<0)
            return 0;
        else if(val>0 && deno<1)
            return 0;
        int with=ways(coins, deno, val-coins[deno-1]);
        int without=ways(coins, deno-1, val);
        return with+without;
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        System.out.println(ways(coins,3,5));    
    }
}

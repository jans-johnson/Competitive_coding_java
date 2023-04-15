public class CutLineSegment {
    public static int fun(int n,int x,int y,int z,int dp[]){
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE ;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = fun(n-x,x,y,z,dp)+1;
        int b = fun(n-y,x,y,z,dp)+1;
        int c= fun(n-z,x,y,z,dp)+1;
        return dp[n] = Math.max(a,Math.max(b,c));
    }
    public static int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int dp[] = new int[n+1];
       for(int i=0;i<=n;i++){
           dp[i] = -1;
       }
      
       int ans = fun(n,x,y,z,dp);
       if(ans<0){
           return 0;
       }
       return ans;
    }
    public static void main(String[] args) {
        System.out.println(maximizeCuts(5, 3, 2, 2));
    }
}

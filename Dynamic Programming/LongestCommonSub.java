public class LongestCommonSub {
    static int longest(String s1,int i1,String s2,int i2)
    {
        int[][] arr=new int[i1+1][i2+1];
        for(int i=1;i<=i1;i++)
        for(int j=1;j<=i2;j++)
        {
            arr[i][j]=Integer.max(arr[i-1][j], arr[i][j-1]);
            if(s1.charAt(i-1)==s2.charAt(j-1))
                arr[i][j]+=1;
        }
        return arr[i1][i2];
    }
    public static void main(String[] args) {
        String s1="ABCDE",s2="A!B#C$D";
        System.out.println(longest(s1,5,s2,7));
    }
}

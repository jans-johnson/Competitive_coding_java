
public class CountPossibleDecoding
{
    public static int countDecoding(int []digits, int n)
    {
        if (n == 0 || n == 1)
            return 1;
        if (digits[0] == 0)
            return 0;
        int count = 0;
        if (digits[n - 1] > 0)
            count = countDecoding(digits, n - 1);
        if (digits[n - 2] == 1 || (digits[n - 2] == 2 && digits[n - 1] < 7))
            count += countDecoding(digits, n - 2);
        return count;
    }

    public static int countDecodingDP(int []digits,int n)
    {
        int[] count=new int[n+1];
        count[0]=1;
        count[1]=1;
        if(digits[0]==0)
            return 0;
        for(int i=2;i<=n;i++)
        {
            count[i]=0;
            if(digits[i-1]>0)
                count[i]=count[i-1];

            if(digits[i-2]==1 ||(digits[i-2]==2 && digits[i-1]>7))
            {
                count[i]+=count[i-2];
            }
        }
        return count[n];
    }

    public static int countWays(int []digits, int n)
    {
        if (n == 0 || (n == 1 && digits[0] == 0))
            return 0;
        return countDecoding(digits, n);
    }


    public static void main (String[]args)
    {
        String s = "1023";
        char[] str = s.toCharArray();
        int n = str.length;
        int []digits = new int[n];

        for (int i = 0; i < n; i++)
            digits[i] = str[i] - '0';

        System.out.println("Count is " + countWays(digits, n));
    }
}
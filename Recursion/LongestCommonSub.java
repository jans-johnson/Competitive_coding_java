package Recursion;

public class LongestCommonSub{
    static int longest(String s1,int i1,String s2,int i2)
    {
        if(i1==s1.length()||i2==s2.length())
            return 0;
        if(s1.charAt(i1)==s2.charAt(i2))
        {
            return 1+longest(s1, i1+1, s2, i2+1);
        }   
        return Integer.max(longest(s1, i1+1, s2, i2), longest(s1, i1, s2, i2+1));

    }
    public static void main(String[] args) {
        String s1="ABCDE",s2="A!B#C$D";
        System.out.println(longest(s1,0,s2,0));
    }
}
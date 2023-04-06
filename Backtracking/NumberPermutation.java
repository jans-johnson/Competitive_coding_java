package Backtracking;

public class NumberPermutation {
    static void permutation(char[] arr,int index,String str)
    {
        if(str.length()==arr.length)
            System.out.println(str);
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                permutation(arr, index+1, str+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        char[] pk={'1','2','3'};
        permutation(pk, 0, "");
    }
    
}

package Backtracking;

public class Permutaiton {
    static void swap(char[] arr,int a1,int a2)
    {
        char temp;
        temp=arr[a1];
        arr[a1]=arr[a2];
        arr[a2]=temp;
    }

    static void permute(char[] arr,int left,int right)
    {
        if(left==right)
        {
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]);
            System.out.println();
        }
        else
        {
            for(int i=left;i<=right;i++)
            {
                System.out.println("i="+i+"left="+left);
                swap(arr, left, i);
                permute(arr, left+1, right);
                swap(arr, left, i);
            }
        }
    }
    public static void main(String[] args) {
        char[] a1={'a','b','c'};
        permute(a1, 0, 2);
    }
}

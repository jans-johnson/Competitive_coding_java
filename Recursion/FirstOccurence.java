package Recursion;
//Code to find the first occurence of an element in an array
public class FirstOccurence {

    static int first(int[] arr,int size,int i,int ele)
    {
        if(i==size)
            return -1;
        if(arr[i]==ele)
            return i;
        else
            return first(arr, size, i+1, ele);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2};
        System.out.print(first(arr, 6, 0, 5));
    }
}

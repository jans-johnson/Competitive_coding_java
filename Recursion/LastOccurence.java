package Recursion;
//Code to find the last occurence of an element in an array
public class LastOccurence {

    static int last(int[] arr,int size,int i,int ele,int pos)
    {
        if(i==size)
            return pos;
        if(ele==arr[i])
            pos=i;
        return last(arr, size, i+1, ele, pos);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,2};
        System.out.print(last(arr, 7, 0, 2,-1));
    }
}
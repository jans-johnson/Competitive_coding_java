package Recursion;

public class BinarySearch {

    static int search(int l,int r,int[] arr,int ele)
    {
        int mid;
        if(r>=l)
            mid=(l+r)/2;
        else 
            return -1;
        if(arr[mid]==ele)
            return mid;
        else if(arr[mid]<ele)
            return search(mid+1, r, arr, ele);
        else
            return search(l, mid-1, arr, ele);
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,9,15};
        System.out.println(search(0, 8, arr, 9));
    }
}

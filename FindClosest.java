public class FindClosest {
//program tp find the closest element in an array to a number (optimized method)
    static int findClosest(int[] arr,int size,int target)
    {
        int mid;
        int i=0,j=size-1;
        if(target>arr[size-1])
            return arr[size-1];
        else if(target<arr[0])
            return arr[0];
        while(i<j)
        {
            mid=(i+j)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target&&arr[mid+1]>target)
            {
                int x=target-arr[mid];
                int y=arr[mid]-target;
                if(x>y)
                    return arr[mid];
                else
                    return arr[mid+1];
            }
            else if(arr[mid]>target)
            {
                i=mid+1;
            }
            else
                j=mid;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};
        System.out.println(findClosest(arr, 8,5));
    }
}

package Recursion;

public class MergeSort {
    
    static void merge(int[] arr,int start,int mid,int end)
    {
        int temp[]=new int[100];
        int i=start,j=mid+1,index=0;
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[index++]=arr[i++];
            }
            else
                temp[index++]=arr[j++];
        }
        if(i>mid)
        while(j<=end)
            temp[index++]=arr[j++];
        else
        while(i<=mid)
        {
            temp[index++]=arr[i++];
        }
        for(i=start;i<index;i++)
        {
            arr[i]=temp[i];
            System.out.print(arr[i]);
        }
        //System.out.println("");
    }

    static void mergeSort(int[] arr,int start,int end)
    {
        int mid;
        if(start<end)
        {
            mid=start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,10,3,4,6,20,15};
        mergeSort(arr, 0, 8);
        for(int i=0;i<=8;i++)
            System.out.println(arr[i]);
    }
}

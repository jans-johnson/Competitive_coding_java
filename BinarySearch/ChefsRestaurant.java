package BinarySearch;

class ChefsRestaurant{
    static void minimumTime(int[] arr,int[] arrival,int x,int n)
    {
        int i=0,max=5,mid;
        for(int j=0;j<x;j++)
        {
            i=0;
            max=5;
            int val=arrival[j];
            if(val>=arr[(max*2)-1])
            {
                System.out.println("-1");
                continue;
            }
            else if(val<arr[0])
            {
                System.out.println(arr[0]-val);
                continue;
            }
            while(i<max)
            {
                mid=(i+max)/2;
                if(val>=(arr[mid*2])&&val<(arr[(mid*2)+1]))
                {
                    System.out.println("0");
                    break;
                }
                else if((mid*2)+2<n)
                {
                    if(val<arr[(mid*2)+2]&&val>arr[(mid*2)+1])
                    {
                        System.out.println(arr[(mid*2)+2]-val);
                        break;
                    }
                }
                else if(val<arr[mid*2]&&val>=arr[(mid*2)-1])
                {
                    System.out.println(arr[mid*2]-val);
                    break;
                }
                else if(val>(arr[mid*2]))
                {
                    i=mid+1;
                }
                else if(val<arr[mid*2])
                {
                    max=mid;
                }
                else{
                    //System.out.println(val<arr[mid*2]);
                    System.out.println("i:"+i+"max:"+max+"arr:"+arr[mid*2]+"val"+val);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,5,7,9,10,20,30};
        int x=5,n=5;
        int[] arrival={5,6,7,35,1};
        minimumTime(arr, arrival, x, n);
    }
}
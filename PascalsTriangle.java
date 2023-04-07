import java.util.ArrayList;

class PascalsTriangle
{
    static ArrayList<ArrayList<Integer>> getTriangle(int n)
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> lst=new ArrayList<>();
            lst.add(1);
            if(i!=1)
            {
                ArrayList<Integer> prev=arr.get(arr.size()-1);
                for(int j=0;j<prev.size()-1;j++)
                {
                    lst.add(prev.get(j)+prev.get(j+1));
                }
                lst.add(1);
            }
            arr.add(lst);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=getTriangle(5);
        System.out.println(arr.toString());
    }
}
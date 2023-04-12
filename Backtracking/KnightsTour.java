package Backtracking;

public class KnightsTour {
    
    static boolean check(int[][] arr,int x,int y)
    {
        if(x>=8||y>=8||x<0||y<0)
            return false;
        else if(arr[x][y]!=0)
            return false;
        return true;
    }

    static int findSol(int[][] arr,int n,int x,int y,int count)
    {
        System.out.println(count);
        int [] xcheck={1,2,-1,-1,-2,-1,1,2};
        int [] ycheck={2,1,2,1,-1,-2,-2,-1};
        arr[x][y]=count;
        if(count==(n*n))
            return 1;
        for(int i=0;i<n;i++)
        {
            if(check(arr,x+xcheck[i],y+ycheck[i]))
            {
                arr[x+xcheck[i]][y+ycheck[i]]=count;
                if(findSol(arr, n, x+xcheck[i], y+ycheck[i], count+1)==1)
                    return 1;
                else
                arr[x+xcheck[i]][y+ycheck[i]]=0;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[][] arr= new int[8][8];
        arr[0][0]=1;
        if(findSol(arr,8,0,0,2)==1)
        {
            System.out.println("Solution found");
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }
        else   
        System.out.println("No solution");    
    }
}

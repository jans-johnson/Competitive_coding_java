package Backtracking;

public class NQueens {

    static void printSolution(int board[][],int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int[][] arr,int row,int column,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i][column]==1)
                return false;
        }
        for(int i=row,j=column;i>=0&&j>=0;i--,j--)
        {
            if(arr[i][j]==1)
                return false;
        }
        for(int i=row, j=column;j >= 0 && i < n;i++,j--)
        {
            if(arr[i][j]==1)
                return false;
        }
        return true;
    }

    static boolean checkCombination(int[][] arr,int row,int n)
    {
        if(row==n)
            return true;
        else
        {
            for(int i=0;i<n;i++)
            {
                if(isSafe(arr,row,i,n))
                {
                    arr[row][i]=1;
                    if(checkCombination(arr, row+1, n))
                        return true;
                    arr[row][i]=0;
                }
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        int n=4;
        int[][] arr=new int[n][n];
        
        if(checkCombination(arr,0,n)==false)
        {
            System.out.println("Solution Doesnot exist !!");
        }
        else
            printSolution(arr, n);
    }
}

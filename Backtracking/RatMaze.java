package Backtracking;

import java.util.*;

public class RatMaze
{
    static int N;
    public static boolean IsValid(ArrayList<ArrayList<Integer> > maze, int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N)
            if (maze.get(x).get(y) > 0)
                return true;

        return false;
    }
    public static void PrintSolution(ArrayList<ArrayList<Integer> > sol)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol.get(i).get(j) + " ");
            System.out.println();
        }
    }
    public static boolean solveMazeUtil(ArrayList<ArrayList<Integer> > maze, int x, int y, ArrayList<ArrayList<Integer> > sol)
    {
        if (x == N - 1 && y == N - 1) {
            if (maze.get(x).get(y) == 1) {
                sol.get(x).set(y, 1);
                return true;
            }
        }
        if (IsValid(maze, x, y))
        {
            if (sol.get(x).get(y) > 0)
                return false;
            sol.get(x).set(y, 1);
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            if (solveMazeUtil(maze, x - 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y - 1, sol))
                return true;
            sol.get(x).set(y, 0);
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        N = 5;
        ArrayList<ArrayList<Integer> > maze =
            new ArrayList<ArrayList<Integer> >(N);
        ArrayList<ArrayList<Integer> > sol =
            new ArrayList<ArrayList<Integer> >(N);

        for (int i = 0; i < N; ++i) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (int j = 0; j < N; ++j) {
                list1.add(1);
                list2.add(0);
            }
            maze.add(list1);
            sol.add(list2);
        }
        maze.get(1).set(2, 0);
        maze.get(3).set(4, 0);
        maze.get(2).set(3, 0);
        maze.get(3).set(0, 0);
        maze.get(4).set(1, 0);

        System.out.println("The maze is as follows:");
        PrintSolution(maze);

        if (solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("The solution is:");
            PrintSolution(sol);
        } else {
            System.out.println("Solution not possible");
        }
    }
}
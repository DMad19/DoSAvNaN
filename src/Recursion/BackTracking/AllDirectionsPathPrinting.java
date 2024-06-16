package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDirectionsPathPrinting {
    public static void main(String[] args) {
        int[][] maze = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        printPaths("",0,0,maze,0);
        List<int[][]> l = returnPaths("",0,0,maze,0);
        for(int[][] li:l){
            for(int[] arr:li){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
    }
    static void printPaths(String p,int a, int b, int[][] maze,int step){
        if(a==maze.length-1 && b==maze[0].length-1){
            step+=1;
            maze[a][b] = step;
            for(int[] row:maze){
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();
            maze[a][b] = 0;
            return;
        }
        if(maze[a][b]!=0){
            return;
        }
        step+=1;
        maze[a][b] = step;
        if(a<maze.length-1){
            printPaths(p+"D",a+1,b,maze,step);
        }
        if(b>0){
            printPaths(p+"L",a,b-1,maze,step);
        }
        if(b<maze[0].length-1){
            printPaths(p+"R",a,b+1,maze,step);
        }
        if(a>0){
            printPaths(p+"U",a-1,b,maze,step);
        }
        maze[a][b] = 0;
    }
    static List<int[][]> returnPaths(String p, int a, int b, int[][] maze, int step){
        if(a==maze.length-1 && b==maze[0].length-1){
            List<int[][]> l = new ArrayList<>();
            step+=1;
            maze[a][b] = step;
            int[][] cp = Arrays.copyOf(maze,maze.length);
            l.add(cp);
            maze[a][b] = 0;
            return l;
        }
        List<int[][]> l = new ArrayList<>();
        if(maze[a][b]!=0){
            return l;
        }
        step+=1;
        maze[a][b] = step;
        if(a<maze.length-1){
            l.addAll(returnPaths(p+"D",a+1,b,maze,step));
        }
        if(b>0){
            l.addAll(returnPaths(p+"L",a,b-1,maze,step));
        }
        if(b<maze[0].length-1){
            l.addAll(returnPaths(p+"R",a,b+1,maze,step));
        }
        if(a>0){
            l.addAll(returnPaths(p+"U",a-1,b,maze,step));
        }
        maze[a][b] = 0;
        List<int[][]> nonEmptyPaths = new ArrayList<>();
        for (int[][] path : l) {
            if (!isEmptyPath(path)) {
                nonEmptyPaths.add(path);
            }
        }

        return nonEmptyPaths;
    }
    static boolean isEmptyPath(int[][] path) {
        for (int[] row : path) {
            for (int value : row) {
                if (value != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

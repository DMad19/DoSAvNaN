package Recursion.BackTracking;

import java.util.ArrayList;

public class AllDirectionsPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        getPaths2("",maze,0,0);
        System.out.println(getPaths2("",maze,0,0));
    }
    static ArrayList getPaths2(String p, boolean[][] maze, int a, int b){
        if(a==maze.length-1 && b==maze[0].length-1){
            ArrayList l =new ArrayList();
            l.add(p);
            return l;
        }
        ArrayList l = new ArrayList();
        if(maze[a][b]==false){
            return l;
        }
        maze[a][b] = false;
        if(a<maze.length-1){
            l.addAll(getPaths2(p+'D',maze,a+1,b));
        }
        if(b<maze[0].length-1){
            l.addAll(getPaths2(p+'R',maze,a,b+1));
        }
        if(a>0){
            l.addAll(getPaths2(p+'U',maze,a-1,b));
        }
        if(b>0){
            l.addAll(getPaths2(p+'L',maze,a,b-1));
        }
        maze[a][b] = true;
        return l;
    }
}

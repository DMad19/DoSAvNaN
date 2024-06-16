package Recursion.BackTracking;

import java.util.ArrayList;

public class PathWIthRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        getPaths("",maze,0,0);
        System.out.println(getPaths2("",maze,0,0));
    }
    static void getPaths(String p,boolean[][] maze,int a,int b){
        if(a==maze.length-1 && b==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[a][b]==false){
            return;
        }
        if(a<maze.length-1){
            getPaths(p+'V',maze,a+1,b);
        }
        if(b<maze[0].length-1){
            getPaths(p+'H',maze,a,b+1);
        }
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
        if(a<maze.length-1){
            l.addAll(getPaths2(p+'V',maze,a+1,b));
        }
        if(b<maze[0].length-1){
            l.addAll(getPaths2(p+'H',maze,a,b+1));
        }
        return l;
    }
}

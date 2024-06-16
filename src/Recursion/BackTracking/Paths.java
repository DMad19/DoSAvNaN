package Recursion.BackTracking;

import java.util.ArrayList;

public class Paths {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
        findPath("",3,3);
        System.out.println(findPath2("",3,3));
        System.out.println(findPath3("",3,3));
    }
    static int countPaths(int a,int b){
        if(a==1 || b==1){
            return 1;
        }
        int count = 0;
        count += countPaths(a-1,b);
        count += countPaths(a,b-1);
        return count;
    }
    static void findPath(String p,int a,int b){
        if(a==1 && b==1){
            System.out.println(p);
            return;
        }
        if(a>1){
            findPath(p+'D',a-1,b);
        }
        if(b>1){
            findPath(p+'R',a,b-1);
        }
    }
    static ArrayList findPath2(String p, int a, int b){
        if(a==1 && b==1){
            ArrayList al = new ArrayList();
            al.add(p);
            return al;
        }
        ArrayList al = new ArrayList();
        if(a>1){
            al.addAll(findPath2(p+'D',a-1,b));
        }
        if(b>1){
            al.addAll(findPath2(p+'R',a,b-1));
        }
        return al;
    }
    static ArrayList findPath3(String p, int a, int b){
        if(a==1 && b==1){
            ArrayList al = new ArrayList();
            al.add(p);
            return al;
        }
        ArrayList al = new ArrayList();
        if(a>1 && b>1){
            al.addAll(findPath3(p+'D',a-1,b-1));
        }
        if(a>1){
            al.addAll(findPath3(p+'V',a-1,b));
        }
        if(b>1){
            al.addAll(findPath3(p+'H',a,b-1));
        }
        return al;
    }
}

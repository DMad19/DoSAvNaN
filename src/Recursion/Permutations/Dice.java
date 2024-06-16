package Recursion.Permutations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice2("",4));
        System.out.println(dicecount("",4));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target ; i++) {
            dice(p+i,target-i);
        }
    }
    static ArrayList dice2(String p, int target){
        if(target==0){
            ArrayList list = new ArrayList();
            list.add(p);
            return list;
        }
        ArrayList list = new ArrayList();
        for (int i = 1; i <= target ; i++) {
            list.addAll(dice2(p+i,target-i));
        }
        return list;
    }

    static int dicecount(String p, int target){
        if(target==0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= target ; i++) {
            count += (dicecount(p+i,target-i));
        }
        return count;
    }
}

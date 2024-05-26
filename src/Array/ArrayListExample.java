package Array;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                list2D.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list2D);
    }
}

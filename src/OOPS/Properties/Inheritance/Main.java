package OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        Box box2 = new Box(1,2,3);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        Box box3 = new Box(box2);
        System.out.println(box3.l+" "+box3.w+" "+box3.h);
    }
}

package OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        Box box2 = new Box(1,2,3);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        Box box3 = new Box(box2);
        System.out.println(box3.l+" "+box3.w+" "+box3.h);
        BoxWithWeight box4 = new BoxWithWeight();
        System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);
        BoxWithWeight box5 = new BoxWithWeight(1,2,3,4);
        System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight);
        BoxWithWeight box6 = new BoxWithWeight(box5,4);
        System.out.println(box6.l+" "+box6.w+" "+box6.h+" "+box6.weight);
    }
}

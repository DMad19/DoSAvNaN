package OOPS.Properties.Inheritance;

public class Box {
    public int l;
    public int w;
    public int h;

    public Box() {
        l = -1;
        h = -1;
        w = -1;
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box another){
        this.l = another.l;
        this.w = another.w;
        this.h = another.h;
    }
}

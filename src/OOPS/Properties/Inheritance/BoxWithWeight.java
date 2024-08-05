package OOPS.Properties.Inheritance;

public class BoxWithWeight extends Box{
    public int weight;
    public BoxWithWeight(){
        weight = -1;
    }

    public BoxWithWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWithWeight(Box another, int weight) {
        super(another);
        this.weight = weight;
    }
}

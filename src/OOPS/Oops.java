package OOPS;

public class Oops {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);
        Integer c = 10;
        Integer d = 20;
        swap(c,d); //will not swap because Integer class is final
        System.out.println(c+" "+d);

        A obj = new A(10,20);
        System.out.println(obj.a+" "+obj.b);
        obj.a = 100;
        System.out.println(obj.a);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static class A{
        int a;
        int b;
        public A(int a, int b){
            this.a = a;
            this.b = b;
        }


        @Override
        protected void finalize() throws Throwable {
            System.out.println("This object is destroyed");
        }
    }
}

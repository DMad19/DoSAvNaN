package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Dhoni = new Human("Dhoni",44,222222,true);
        Human Kohli = new Human("Kohli",44,222222,true);
        System.out.println(Human.population);
        message();
    }
    static void message(){
        System.out.println("hi");
        Main obj = new Main();
        obj.message2(); //static. so obj required.
    }
    void message2(){
//        message(); can call without a obj
        System.out.println("hi2");
    }
}

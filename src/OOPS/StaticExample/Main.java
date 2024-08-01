package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Dhoni = new Human("Dhoni",44,222222,true);
        Human Kohli = new Human("Kohli",44,222222,true);
        System.out.println(Human.population);
    }
}

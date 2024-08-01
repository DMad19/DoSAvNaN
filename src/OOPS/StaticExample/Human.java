package OOPS.StaticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;
    static int population;
    public Human(String name,int age,int salary,boolean isMarried){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population +=1;
    }
}

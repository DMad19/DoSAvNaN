package OOPS.StaticExample;

public class Singleton {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj1+" "+obj2);
    }
    static class SingletonClass{
        private String name;
        private SingletonClass(){}

        private static SingletonClass instance ;

        public static SingletonClass getInstance(){
            if(instance == null){
                instance = new SingletonClass();
                instance.name = "obj";
            }
            return instance;
        }
    }
}

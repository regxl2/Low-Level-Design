package _7_singleton_pattern;

public class BasicSingleton {
    private static BasicSingleton instance;
    private BasicSingleton(){
        System.out.println("BasicSingleton constructor is called");
    }
    public static BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        return instance;
    }
}

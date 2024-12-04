package _7_singleton_pattern;

public class Main {
    public static void main(String[] args) {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        // You can see in the output, only one time constructor will be called.
        if(basicSingleton.equals(basicSingleton1)){
            System.out.println("Both are same");
        }

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        // You can see in the output, only one time constructor will be called.
        if(threadSafeSingleton.equals(threadSafeSingleton1)){
            System.out.println("Both are same");
        }
    }
}

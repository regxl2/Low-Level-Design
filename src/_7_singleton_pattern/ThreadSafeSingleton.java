package _7_singleton_pattern;

public class ThreadSafeSingleton {
//     this volatile keyword, makes the thread directly read the variable
//     from the memory not from the cache to avoid the inconsistency in the variable's value in Multithreaded environment.
    private static volatile ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
        System.out.println("Thread safe singleton's constructor is called");
    }
//     using synchronized on method can cause overhead if getInstance method is
//     frequently called, in that case we synchronized keyword on the block.
//    public static synchronized ThreadSafeSingleton getInstance(){
//        if(instance == null){
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

package my.dpj.raheddin.creationalDesignPattern.singleton;

public class SingletonLazy {

    private static SingletonLazy singleton;

    private SingletonLazy() {
        System.out.println("Create Singleton Object!");
    }

    public static SingletonLazy getSingleton() {

     //Double Checked Locking
        if (singleton == null) {
            synchronized (SingletonLazy.class) {
                if (singleton == null) {
                    singleton = new SingletonLazy();
                }
            }
        }
        return singleton;
    }
}

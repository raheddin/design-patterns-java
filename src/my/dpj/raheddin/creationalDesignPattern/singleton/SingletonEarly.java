package my.dpj.raheddin.creationalDesignPattern.singleton;

public class SingletonEarly {

    private static SingletonEarly singleton = new SingletonEarly();

    private SingletonEarly() {
        System.out.println("Create Singleton Object!");
    }

    public static SingletonEarly getSingleton() {
        return singleton;
    }
}

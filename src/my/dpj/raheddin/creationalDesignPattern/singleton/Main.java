package my.dpj.raheddin.creationalDesignPattern.singleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingletonEarly singleton = SingletonEarly.getSingleton();
        }

        for (int i = 0; i < 10; i++) {
            SingletonLazy singletonLazy = SingletonLazy.getSingleton();
        }
    }
}

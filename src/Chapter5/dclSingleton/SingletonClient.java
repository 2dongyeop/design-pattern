package Chapter5.dclSingleton;

import Chapter5.classicSingleton.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Chapter5.classicSingleton.Singleton singleton = Singleton.getInstance();
    }
}

package Singleton;

public final class Singleton {
    private static Singleton instance;
    private static int k=0;

    private Singleton() {
        k++;
        System.out.println(k);

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}



package Singleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton instance = Singleton.getInstance();
        }
    }
}
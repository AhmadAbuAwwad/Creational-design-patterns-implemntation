package design.patterns.implementation.creational;

//  Singleton class
public final class Singleton {

    //  Private Instance and Constructor
    private static Singleton instance;
    public String value;
    private Singleton() {
    }
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
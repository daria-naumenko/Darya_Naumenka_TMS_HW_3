package by.naumenka.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Language java = factory.create("Java");
        Language python = factory.create("Python");
        java.write();
        python.write();
    }
}
package by.naumenka.AbstractFactory;

public class Main {
    private static Applications configureApplication() {
        Applications app;
        PhoneFactory factory;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.contains("android")) {
            factory = new AndroidFactory();
        } else {
            factory = new IphoneFactory();
        }
        app = new Applications(factory);
        return app;
    }

    public static void main(String[] args) {
        Applications app = configureApplication();
        app.unlocking();
    }
}
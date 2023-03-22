package by.naumenka.FactoryMethod;

public class Factory {
    public Language create(String typeOfLanguage){
        switch (typeOfLanguage){
            case "Java" : return new Java();
            case "Python" : return new Python();
            default: return null;
        }
    }
}
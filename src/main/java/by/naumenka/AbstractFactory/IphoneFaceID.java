package by.naumenka.AbstractFactory;

public class IphoneFaceID implements FaceID{
    @Override
    public void unlocking() {
        System.out.println("Ваш Iphone разблокирован FaceID");
    }
}
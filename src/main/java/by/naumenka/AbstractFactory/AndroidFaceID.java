package by.naumenka.AbstractFactory;

public class AndroidFaceID implements FaceID{
    @Override
    public void unlocking() {
        System.out.println("Ваш Android разблокирован FaceID");
    }
}
package by.naumenka.AbstractFactory;

public class AndroidFactory implements PhoneFactory{
    @Override
    public FaceID createFaceID() {
        return new AndroidFaceID();
    }

    @Override
    public Password createPassword() {
        return new AndroidPassword();
    }
}
package by.naumenka.AbstractFactory;

public class IphoneFactory implements PhoneFactory{
    @Override
    public FaceID createFaceID() {
        return new IphoneFaceID();
    }

    @Override
    public Password createPassword() {
        return new IphonePassword();
    }
}
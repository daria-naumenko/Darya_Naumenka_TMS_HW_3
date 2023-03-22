package by.naumenka.AbstractFactory;

public interface PhoneFactory {
    FaceID createFaceID();
    Password createPassword();
}
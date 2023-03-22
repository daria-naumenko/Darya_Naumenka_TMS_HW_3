package by.naumenka.AbstractFactory;

public class Applications {
    private FaceID faceID;
    private Password password;

    public Applications(PhoneFactory factory){
        faceID = factory.createFaceID();
        password = factory.createPassword();
    }

    public void unlocking(){
        faceID.unlocking();
        password.unlocking();
    }
}
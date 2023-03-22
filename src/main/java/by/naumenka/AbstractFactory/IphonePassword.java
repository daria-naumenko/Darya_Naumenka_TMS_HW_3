package by.naumenka.AbstractFactory;

public class IphonePassword implements Password{
    @Override
    public void unlocking() {
        System.out.println("Ваш Iphone разблокирован паролем");
    }
}
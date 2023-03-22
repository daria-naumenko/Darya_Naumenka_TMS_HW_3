package by.naumenka.AbstractFactory;

public class AndroidPassword implements Password{
    @Override
    public void unlocking() {
        System.out.println("Ваш Android разблокирован паролем");
    }
}
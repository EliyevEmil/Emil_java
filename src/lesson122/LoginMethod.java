package lesson122;

public sealed class LoginMethod permits PasswordAuth {
    public void test() {
        System.out.println("Təhlükəsiz giriş sistemi");
    }
}
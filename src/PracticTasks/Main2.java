package PracticTasks;

public class Main2 {
    public static void loginpin(int pin) throws WrongPinException {
        int dogrupin = 1234;

        if (pin == dogrupin) {
            System.out.println("Ura! PIN dogrudur, xos geldin!");
        } else {
            throw new WrongPinException("Sehv pin var!");
        }
    }
    public static void main(String[] args) {
        try{
            loginpin(1234);
        } catch (WrongPinException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}



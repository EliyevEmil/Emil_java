package lesson107;

public class Main7 {
    public static void main(String[] args) {

        Days buGun = Days.MONDAY;

        switch (buGun) {
            case MONDAY:
                System.out.println("İş həftəsinin başlanğıcıdır");
                break;
            case TUESDAY:
                System.out.println("Dərslər davam edir, dözün!");
                break;
            case WEDNESDAY:
                System.out.println("Həftənin tən ortası gəldi");
                break;
            case THURSDAY:
                System.out.println("Az qaldı, sabah cümədir!");
                break;
            case FRIDAY:
                System.out.println("Həftənin son iş günüdür");
                break;
            case SATURDAY:
                System.out.println("Ura, kompyuter oynamaq vaxtıdır!");
                break;
            case SUNDAY:
                System.out.println("İstirahət günüdür");
                break;
        }
    }
}
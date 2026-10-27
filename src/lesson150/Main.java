package lesson150;

public class Main {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setAppName("MənimOyunum");
        config1.setVersion("1.0");
        config1.setLanguage("Azərbaycan");
        config1.setMaintenanceMode(false);

        System.out.println("Eyni obyektmi? " + (config1 == config2));

        System.out.println("App Name: " + config2.getAppName());
        System.out.println("Version: " + config2.getVersion());
        System.out.println("Language: " + config2.getLanguage());
        System.out.println("Maintenance Mode: " + config2.isMaintenanceMode());
    }
}
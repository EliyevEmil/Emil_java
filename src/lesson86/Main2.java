package lesson86;

class QiriciTeyyare {
    String model;
    int maxSuret;

    public void hucumEt() {
        System.out.println(model + " qırıcısı maksimum " + maxSuret + " km/s sürətlə hücuma keçdi!");
    }
}

public class Main2 {
    public static void main(String[] args) {

        QiriciTeyyare jet1 = new QiriciTeyyare();

        jet1.model = "MiG-29";
        jet1.maxSuret = 2400;

        QiriciTeyyare jet2 = new QiriciTeyyare();

        jet2.model = "F-16";
        jet2.maxSuret = 2120;

        System.out.println("Yaradılmış obyektlərin hərəkəti:");
        jet1.hucumEt();
        jet2.hucumEt();

    }
}
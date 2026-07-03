package lesson86;

class Teyyare {
    private String model;
    private int suret;

    public Teyyare(String model, int suret) {
        this.model = model;
        this.suret = suret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSuret() {
        return suret;
    }

    public void setSuret(int suret) {
        if (suret > 0) {
            this.suret = suret;
        }
    }

    public void uş() {
        System.out.println(model + " təyyarəsi saatda " + suret + " km sürətlə göyə qalxdı!");
    }
}

public class Main {
    public static void main(String[] args) {

        Teyyare t1 = new Teyyare("Boeing 777", 900);

        t1.uş();

        t1.setSuret(950);
        System.out.println("Yeni sürət: " + t1.getSuret() + " km/s");

    }
}
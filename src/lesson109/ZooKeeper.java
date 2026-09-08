package lesson109;

public class ZooKeeper {
    private String ad;

    public ZooKeeper(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void heyvanıQidalandır(Animal heyvan) {
        System.out.println(ad + " baxıcısı " + heyvan.getAd() + "-a yaxınlaşır...");
        heyvan.yemVer();
    }

    public void heyvanaQulaqAs(Animal heyvan) {
        heyvan.sesCixar();
    }
}
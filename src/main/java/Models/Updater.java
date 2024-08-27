package Models;

public abstract class Updater {
    public Updater(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void increaseQuality();
    public abstract void decreaseQuality();

}

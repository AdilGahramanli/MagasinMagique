package Models;

public class BasicItem extends Updater{
    public BasicItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void increaseQuality() {

    }

    @Override
    public void decreaseQuality() {

    }
}

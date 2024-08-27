package Factory;

import Models.Comte;
import Models.PassVIP;
import com.magasin.Item;

public class ItemFactory {

    public Object createItems() {
        // Crée et retourne un tableau d'items prédéfinis
        return new Object[]{
                new Comte("Comté", 10, 20),
                new PassVIP("Pass VIP Concert", 5, 40),
                new Item("Kryptonite", 15, 80),
                new Item("Pouvoirs magiques", 3, 10),
                new Item("Item classique", 0, 7)
        };


    }}

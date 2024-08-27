package com.magasin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

//    @Test
//    void foo() {
//        Item[] items = new Item[] { new Item("Comté", 0, 1) };
//        Magasin app = new Magasin(items);
//        app.updateQuality();
//        System.out.println(items[0]);
//        assertEquals("Comté", app.items[0].name, "name = "+ app.items[0].name);
//        assertEquals(-1, app.items[0].sellIn, "sellIn = "+ app.items[0].sellIn);
//        assertEquals(3, app.items[0].quality, "quality = "+ app.items[0].quality);
//    }
        @Test
        public void testResult() {
            // Création des tableaux de valeurs possibles pour sellIn et quality
            int[] sellInValues = generateRange(-10, 10);
            int[] qualityValues = generateRange(0, 50);

            // Liste pour stocker les résultats
            List<String> resultats = new ArrayList<>();

            for (int sellIn : sellInValues) {
                for (int quality : qualityValues) {
                    // Initialisation d'un item pour chaque combinaison
                    Item item = new Item("Comté", sellIn, quality);
                    Item[] items = new Item[]{item};
                    Magasin magasin = new Magasin(items);

                    // Capture des valeurs initiales
                    String initial = "Initial: [name: " + item.name + ", sellIn: " + item.sellIn + ", quality: " + item.quality + "]";

                    // Appel de la méthode à tester
                    magasin.updateQuality();

                    // Capture des valeurs après mise à jour
                    String resultat = "Résultat: [name: " + item.name + ", sellIn: " + item.sellIn + ", quality: " + item.quality + "]";

                    // Stocker le résultat initial et le résultat après update
                    resultats.add(initial + " -> " + resultat);
                }
            }

            // Affichage des résultats
            for (String res : resultats) {
                System.out.println(res);
            }
        }

        // Méthode pour générer un tableau d'entiers pour une plage donnée
        private static int[] generateRange(int start, int end) {
            int[] range = new int[end - start + 1];
            for (int i = 0; i < range.length; i++) {
                range[i] = start + i;
            }
            return range;
        }
    }

package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void decreaseQuality(Item item, int value){
        item.quality = item.quality - value;
        item.sellIn = item.sellIn + 1;
    }
    public boolean checkQualityisNegative(Item item){
        if (item.quality < 0 ){
            return true;
        }
        else{
            return false;

        }
    }

    public boolean checkQualityLimite(Item item){
        if (item.quality > 50 ){
            return true;
        }
        else{
            return false;
        }

    }
    public void increaseQuality(Item item , int value){
        item.quality = item.quality + value;
        item.sellIn = item.sellIn + 1;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {

            boolean QualityLimite = checkQualityLimite(items[i]);
            boolean QualityNegative = checkQualityisNegative(items[i]);

            if (!QualityNegative && !QualityLimite) {

                switch (items[i].name) {
                    case "Comté" -> increaseQuality(items[i], 1);
                    case "Pass VIP Concert" -> {
                        if (items[i].sellIn > 10) {
                            increaseQuality(items[i], 1);
                        } else if (items[i].sellIn <= 10) {
                            increaseQuality(items[i], 2);
                        } else if (items[i].sellIn <= 5) {
                            increaseQuality(items[i], 3);
                        } else if (items[i].sellIn <= 0) {
                            items[i].quality = 0;
                        }
                    }
                    case "Pouvoirs magiques" -> {
                        if (items[i].sellIn <= 0) {
                            decreaseQuality(items[i], 4);
                        } else if (items[i].sellIn > 0) {
                            decreaseQuality(items[i], 1);
                        }
                    }
                    default -> {
                        // Cas où l'item ne correspond à aucun des cas spécifiques
                        if (!items[i].name.equals("Kryptonite")) {
                            if (items[i].sellIn <= 0) {
                                decreaseQuality(items[i], 2);
                            } else {
                                decreaseQuality(items[i], 1);
                            }
                        }
                }


                }
            }
        }

    }}

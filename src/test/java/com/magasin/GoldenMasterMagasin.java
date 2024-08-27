package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class GoldenMasterMagasin {

    @Test
    public void testMagasinFooSellin0(){

        Item[] items = new Item[] { new Item("Foo", 0, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn, "Sellin should equal -1");
        assertEquals(32, app.items[0].quality, "Quality should equal 32");

    }

    @Test
    public void testMagasinComteSellin0(){

        Item[] items = new Item[] { new Item("Comté", 0, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn, "Sellin should equal -1");
        assertEquals(32, app.items[0].quality, "Quality should equal 32");

    }
    @Test
    public void testMagasinComteSellinMinus1(){

        Item[] items = new Item[] { new Item("Comté", -1, 32) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn, "Sellin should equal -2");
        assertEquals(34, app.items[0].quality, "Quality should equal 34");


    }
    @Test
    public void testMagasinComteSellinMinus2(){

        Item[] items = new Item[] { new Item("Comté", -2, 34) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(-3, app.items[0].sellIn, "Sellin should equal -3");
        assertEquals(36, app.items[0].quality, "Quality should equal 36");


    }
    @Test
    public void testMagasinComteSellin4(){

        Item[] items = new Item[] { new Item("Comté", 4, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println(" premier : name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(31, app.items[0].quality, "Quality should equal 32");

    }
    @Test
    public void testMagasinComteSellin3(){

        Item[] items = new Item[] { new Item("Comté", 3, 31) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println(" deuxieme : name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(32, app.items[0].quality);

    }
    @Test
    public void testMagasinComteSellin2() {

        Item[] items = new Item[]{new Item("Comté", 2, 32)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("Troisieme : name :" + app.items[0].name + " sellin :" + app.items[0].sellIn + " quality :" + app.items[0].quality);
        assertEquals(33, app.items[0].quality);
    }

    @Test
    public void testMagasinKryptonite(){

        Item[] items = new Item[] { new Item("Kryptonite", 0, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(30, app.items[0].quality);

    }
    @Test
    public void testMagasinKryptoniteMinus2(){

        Item[] items = new Item[] { new Item("Kryptonite", -2, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(30, app.items[0].quality);

    }
    @Test
    public void PassVIPConcertsellin11(){

        Item[] items = new Item[] { new Item("Pass VIP Concert", 11, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(31, app.items[0].quality);

    }
    @Test
    public void PassVIPConcertsellin10(){

        Item[] items = new Item[] { new Item("Pass VIP Concert", 10, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(32, app.items[0].quality);

    }
    @Test
    public void PassVIPConcertsellin5(){

        Item[] items = new Item[] { new Item("Pass VIP Concert", 5, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(33, app.items[0].quality);

    }
    @Test
    public void PassVIPConcertsellin(){

        Item[] items = new Item[] { new Item("Pass VIP Concert", -1, 30) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        System.out.println("name :" + app.items[0].name + " sellin :" +app.items[0].sellIn + " quality :" +app.items[0].quality);
        assertEquals(0, app.items[0].quality);

    }


}
package excercises.packBag;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import excercises.packBag.BagOfHolding.Item;

public class BagOfHoldingTest {

    @Test
    public void testOrder() {

        BagOfHolding bagOfHolding = new BagOfHolding();

        List<Item> items = new ArrayList<Item>();

        Item item = new Item(2, 3);
        Item item1 = new Item(3, 3);
        Item item2 = new Item(4, 3);
        Item item3 = new Item(5, 3);
        Item item4 = new Item(6, 3);
        Item item5 = new Item(7, 3);
        Item item6 = new Item(8, 3);
        Item item7 = new Item(9, 3);
        Item item8 = new Item(2, 2);
        Item item9 = new Item(2, 1);
        Item item10 = new Item(3, 3);
        Item item11 = new Item(4, 1);
        Item item12 = new Item(7, 7);
        Item item13 = new Item(8, 1);
        Item item14 = new Item(4, 6);
        Item item15 = new Item(2, 9);
        Item item16 = new Item(10, 3);
        Item item17 = new Item(15, 3);
        Item item18 = new Item(2, 6);
        Item item19 = new Item(1, 30);
        Item item20 = new Item(4, 13);
        Item item21 = new Item(20, 2);

        items.add(item21);
        items.add(item20);
        items.add(item19);
        items.add(item18);
        items.add(item17);
        items.add(item16);
        items.add(item15);
        items.add(item14);
        items.add(item13);
        items.add(item12);
        items.add(null);
        items.add(null);
        items.add(null);
        items.add(null);
        items.add(null);
        items.add(null);
        items.add(null);
        items.add(item11);
        items.add(item10);
        items.add(item9);
        items.add(item7);
        items.add(item8);
        items.add(item6);
        items.add(item5);
        items.add(item4);
        items.add(item3);
        items.add(item2);
        items.add(item1);

        for (Item i : items) {
            if (null == i) {
                System.out.println("is null");
            } else {
                System.out.println("Value " + i.value + " Size " + i.size + " ratio " + i.valuePerSize);
            }
        }

        items = bagOfHolding.packBag(items, 11);

        System.out.println("\n----SORT REMOVE-----\n");

        for (Item i : items) {
            System.out.println("Value " + i.value + " Size " + i.size + " ratio " + i.valuePerSize);
        }
    }

}

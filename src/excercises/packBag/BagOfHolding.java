package excercises.packBag;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Class contains logic to sort a list of items efficiently given a capacity.
 * Contains the inner class of Item.
 * 
 */
public class BagOfHolding {

    /**
     * Takes the list of items and packs it to have the highest value possible
     * for a given capacity. Items that exceed the capacity will be removed.
     * 
     * @param items
     * @param capacity
     * @return The List of items packed efficiently
     */
    public static void packBag(List<Item> items, int capacity) {

        // check list is not null or empty, otherwise logic will not work.
        if (null != items && !items.isEmpty()) {

            int totalItemsSize = 0;
            Item item = null;
            Iterator<Item> itr = null;
            
            // get the iterator to be able to loop through the list safely.
            itr = items.iterator();

            // Iterate through the list and remove any null elements in the list
            while (itr.hasNext()) {
                if (null == itr.next()) {
                    itr.remove();
                }
            }

            // Sorts the list of items by using it's overridden compareTo
            // method. Will sort by descending order with highest valuePreSize
            // coming first.
            Collections.sort(items);
            
            //re-retrieve the updated iterator as elements may have been removed.
            itr = items.iterator();

            // while the next element is present
            while (itr.hasNext()) {

                // Get the next item in the list.
                item = itr.next();

                // check whether the item's size will take the list size
                // over the capacity.
                if ((totalItemsSize + item.size) <= capacity) {

                    // if it doesn't then add the size of the items to the
                    // overall list size
                    totalItemsSize += item.size;

                } else {

                    // otherwise if this item doesn't fit in the list
                    // without going over the capacity then remove it from the
                    // list.
                    itr.remove();
                }
            }
        }
    }

    public static class Item implements Comparable<Item> {

        // The value of the item

        public int value;

        // The size of the item, consumes capacity in the bag

        public int size;

        // The value of the item per unit size.

        public double valuePerSize;

        public Item(int value, int size) {

            this.value = value;

            this.size = size;

            this.valuePerSize = (double) value / (double) size;

        }

        /**
         * Compares this item to another by it's value pre size ratio. Will
         * return negative if this is larger or positive if this is smaller than
         * the argument in order to sort the items in descending order.
         */
        @Override
        public int compareTo(Item item) {

            if (this.valuePerSize > item.valuePerSize) {
                return -1;
            }
            if (this.valuePerSize == item.valuePerSize) {
                return 0;
            }

            return 1;
        }
    }
}
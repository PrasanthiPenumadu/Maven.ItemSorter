package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item items[];
    public ItemSorter(Item[] items) {
        this.items=items;
    }

    public Item[] sort(Comparator<Item> comparator) {
       // Comparator<Item> idComparator=Comparator.comparing(Item::getId);
      // Comparator<Item> nameComparator=Comparator.comparing(Item::getName);
       // Comparator<Item> priceComparator=Comparator.comparing(Item::getPrice);
       // Arrays.sort(items,priceComparator);
        Arrays.sort(items,comparator);
        //Arrays.sort(items,nameComparator);
        return items;
    }
}

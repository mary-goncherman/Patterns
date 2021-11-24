package main.java.patterns.iteratorComponovschik;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position>= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position = position + 1;
        return menuItem;
    }
}

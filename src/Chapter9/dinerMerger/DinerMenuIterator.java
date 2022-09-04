package Chapter9.dinerMerger;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        return items[position++];
    }

    public boolean hasNext() {
        return items.length > position;
    }

    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지울 수 없습니다.");
    }
}


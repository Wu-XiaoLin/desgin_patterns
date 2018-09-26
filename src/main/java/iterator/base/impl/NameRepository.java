package iterator.base.impl;

import iterator.base.Container;
import iterator.base.Iterator;

public class NameRepository implements Container {

    private String[] names = {"张三", "李四", "王五", "钱大"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index >= names.length) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}

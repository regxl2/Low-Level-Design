package _17_iterator_pattern;

import _17_iterator_pattern.collection.IntegerList;
import _17_iterator_pattern.iterator.IntegerListIterator;

public class Demo {
    public static void main(String[] args) {
        IntegerList list = new IntegerList();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        IntegerListIterator iterator = list.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

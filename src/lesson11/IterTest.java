package lesson11;

import java.util.*;

public class IterTest {
    static class Iter<T> implements Iterable<T>{
        private T[] arr ;

        public Iter(T[] arr) {
            this.arr = arr;
        }

        @Override
        public Iterator<T> iterator() {
            return new It<T>(arr);
        }
    }

    static class It<T> implements Iterator<T>{
        private T[] arr;
        private int cursor = 0;
        public It(T[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return cursor < arr.length ;
        }

        @Override
        public T next() {
            return arr[cursor++];
        }
    }

    public static void main(String[] arg){
        Integer[] arr = {1,2,3,4};
        Iter<Integer> Iterable = new Iter<>(arr);
        It<Integer> iterator = (It<Integer>) Iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.hasNext() + "::" + iterator.next());
        }
    }

}

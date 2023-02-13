package generics;

public class GenericList <T extends Comparable & Cloneable>{
    private T[] items = (T[]) new Object[10]; //Typecasting into array of T's but can't instantiate directly
    private int count;

    public void add(T item){
        items[count++] = item;
    }
    public T get  (int index){
        return items[index];
    }
}

package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T a , T b){
        return  a.compareTo(b) <= 0 ? b : a;
    }

    public static <K,V> void print(K key,V value){
        System.out.println("Key = " + key + " value = "+ value);
    }

    public static void printList(GenericList<?> userList){

    }
}

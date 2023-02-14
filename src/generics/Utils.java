package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T a , T b){
        return  a.compareTo(b) <= 0 ? b : a;
    }
}

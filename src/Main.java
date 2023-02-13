import generics.GenericList;
import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); //Boxing int to Integer
        GenericList<Float> floatNumbers = new GenericList<>();
        floatNumbers.add(1.0F);//Boxing float to Float
    }
}
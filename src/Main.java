import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1);//equivalent of Integer.valueof(1);
        list.add("string");
        list.add(new User());
        int number = (int)list.get(1);
    }
}
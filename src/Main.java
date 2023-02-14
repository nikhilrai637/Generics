import generics.GenericList;
import generics.List;
import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10),new User(50));
        System.out.println(max);
    }

}
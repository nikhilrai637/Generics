import generics.GenericList;
import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args) {
        GenericList<User> userGenericList = new GenericList<User>();
        userGenericList.add(new User());
        userGenericList.add(new User());

        User u = userGenericList.get(1);

    }
}
package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T a , T b){
        return  a.compareTo(b) <= 0 ? b : a;
    }

    public static <K,V> void print(K key,V value){
        System.out.println("Key = " + key + " value = "+ value);
    }
    // CAP#1 {} extends User
    // Instructor extends User

    public static void printList(GenericList<? super User> userList){
      // User user =  userList.get(0);
      // Instructors user = userList.get(0); // CAP#1 extends user is not a subclass of Instructors  but of User
      // userList.add(Cap) // np such capture class
        // Here  user and all its subclasses
        userList.add(new User(0)); //
        userList.add(new Instructors(10));


    }
}

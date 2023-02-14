import generics.*;

public class Main {
    public static void main(String[] args) {
         var instructors = new GenericList<Instructors>();
         Utils.printList(instructors); // error because the GenericList<Instructors>
                                      // is not the subclass of GenericList<Users>


    }

}
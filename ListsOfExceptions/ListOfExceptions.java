
import java.util.*;



public class ListOfExceptions {
    public static void exceptionsList() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("27");
        myList.add("Pink");
        myList.add(300);
        myList.add("Pasta-roni");

        try {
            for(int i = 0; i < myList.size(); i++){
                Integer castedValue = (Integer) myList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("This is a catch error is being thrown at you now.");
        }


    }
}

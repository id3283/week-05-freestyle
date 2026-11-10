import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Charlie");
        names.add("Blake");
        names.add("Aaron");

//        for (int i = names.size() - 1; i >= 0; i--) {
//            System.out.println( names.get(i) );
//        }

        Collections.reverse(names);

//        for (String name : names) {
//            System.out.println(name);
//        }

    }
}


import java.util.*;

class LinkedListOne {

    public static void main(String[] args) {

        LinkedList<String> enames = new LinkedList<String>();
        enames.add("abc");
        enames.add("ghi");
        enames.add("ijk");

        System.out.println(enames);
        Collections.sort(enames);
        System.out.println(enames);
        Collections.sort(enames, Collections.reverseOrder());
        System.out.println(enames);
        Collections.shuffle(enames);
        System.out.println(enames);

    }
}

package PreDefinedFI;

import java.util.*;
import java.util.function.Predicate;

public class ArrayListIm {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        //enames.add("Rahul");
        Predicate<List> p=list->list.isEmpty();
        System.out.println(p.test(enames));

    }


}

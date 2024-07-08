package PreDefinedFI;

import java.util.*;
import java.util.function.Function;
//import java.util.function.Predicate;

public class ArrayListPIF {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        //Predicate<List> p=list->list.isEmpty();
        //System.out.println(p.test(enames));//false
        Function<List,Integer> p=list->list.size();
        System.out.println(p.apply(enames)); //1

    }


}

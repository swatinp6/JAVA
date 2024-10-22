package StreamAPIs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//WITH STREAM
public class StringEx {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("John");
        enames.add("Jane");
        enames.add("Bob");
        enames.add("Jack");
        enames.add("Jill");
        System.out.println(enames);
        List<String> names = enames.stream().sorted().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);


    }
}

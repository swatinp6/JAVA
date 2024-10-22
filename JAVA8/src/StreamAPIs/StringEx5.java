package StreamAPIs;

import java.util.*;
//with stream
public class StringEx5 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("John");
        enames.add("Jane");
        enames.add("Bob");
        enames.add("Jack");
        enames.add("Jill");
        System.out.println(enames);
        //enames.stream().filter(ename->ename.startsWith("B")).forEach(System.out::println);
        enames.stream().filter(ename->ename.startsWith("J")).forEach(ename->System.out.println(ename));
    }


}

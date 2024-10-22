package StreamAPIs;

import java.util.ArrayList;
//With Stream --counting number of enames start with "J"
public class StringEx3 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("John");
        enames.add("Jane");
        enames.add("Bob");
        enames.add("Jack");
        enames.add("Jill");
        System.out.println(enames);
        long no_of_enames=enames.stream().filter(name->name.startsWith("J")).count();
        System.out.println(no_of_enames);
    }
}

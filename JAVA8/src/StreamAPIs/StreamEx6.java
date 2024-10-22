package StreamAPIs;

import java.util.ArrayList;
//without stream
public class StreamEx6 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("John");
        enames.add("Jane");
        enames.add("Bob");
        enames.add("Jack");
        enames.add("Jill");
        System.out.println(enames);
        for(String name : enames) {
            if(name.startsWith("J")){
                System.out.println(name.toUpperCase());
            }
        }

    }
}

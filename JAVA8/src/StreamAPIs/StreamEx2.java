package StreamAPIs;

import java.util.*;

//Without STREAM
public class StreamEx2 {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RAHUL","PRIYANKA","PREETI","SONIA");
        System.out.println(enames);
        Collections.sort(enames);
        System.out.println("sorted arraylist:"+enames);
        List<String> new_names=new ArrayList<String>();
        for(String ename:enames){
            new_names.add(ename.toLowerCase());
        }
        System.out.println(new_names);
    }

}

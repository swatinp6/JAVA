package StreamAPIs;


import java.util.*;


public class String4 {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RAHUL","PRIYANKA","PREETI","SONIA");
        System.out.println(enames);
        int no_of_enames=0;
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            if(itr.next().toString().startsWith("P")){
                no_of_enames++;
            }
        }
        System.out.println(no_of_enames);
    }
}

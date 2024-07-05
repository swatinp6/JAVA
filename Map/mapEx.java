
import java.util.*;

class MapEx{
    public static void main(String[] args) {
         HashMap<String,String> emp=new HashMap<String,String>();
         emp.put("id","101");
         emp.put("name","Rahul");
         emp.put("sal","45000");
         emp.put("loc", "New Delhi");
         System.out.println(emp);
         System.out.println( emp.get("name"));
         System.out.println( emp.get("id"));
         System.out.println( emp.get("sal"));
         System.out.println( emp.get("loc"));
         emp.remove("id");
         System.out.println(emp);
         System.out.println(emp.values());
         System.out.println(emp.keySet());
         System.out.println(emp.entrySet());

    }
}
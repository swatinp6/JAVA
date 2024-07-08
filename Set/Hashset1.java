
import java.util.*;

class Test{
    public static void main(String[] args) {
        Set<Integer> eids=new HashSet<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        System.out.println(eids);
         Set<Integer> eids1=new HashSet<Integer>();
        eids1.add(104);
        eids1.add(106);
        eids1.add(107);
        System.out.println(eids1);
        eids.addAll(eids1);
        System.out.println(eids);
        eids.retainAll(eids1);//intersection
        System.out.println(eids);
        
        
        
    }
}
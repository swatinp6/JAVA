
import java.util.*;
class Test{
    public static void main(String[] args) {
        Set<String> eids=new HashSet<String>();
        eids.add("Rahul");
        eids.add("Priyanka");
        eids.add("Sonia");
        eids.add("Indira");
        eids.add("Modi");
        eids.add("Yogi");
        eids.add("Amith");
        ArrayList<String> eid=new ArrayList<String>(eids);
        System.out.println(eid);
        Collections.sort(eid);
        System.out.println(eid);
        Collections.sort(eid,Collections.reverseOrder());
        System.out.println(eid);
        
        
        
    }
}

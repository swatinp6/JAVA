/*dulpicates are not allowed
Homogeneous allowed
null insertion allowed only once
indexing concept is possible bt simple for loop is not applicable for iteration only forEach and iterator are allowed 
order guarantee is possible */
import java.util.*;
class LinkedTest{
        public static void main(String[] args) {
            LinkedHashSet<Integer> eids=new LinkedHashSet<Integer>();
            eids.add(101);
            eids.add(102);
            eids.add(103);
            eids.add(104);
            eids.add(105);
            eids.add(null);
            System.out.println(eids);
        }
}
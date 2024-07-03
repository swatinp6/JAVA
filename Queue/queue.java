
import java.util.*;
class QueueExample{
    public static void main(String[] args) {
       // PriorityQueue<Integer> eids=new PriorityQueue<Integer>();
        //eids.add(101);
        //eids.add(102);
        //eids.add(103);
        //eids.add(104);
        //System.out.println(eids);
        PriorityQueue<String> enames=new PriorityQueue<String>();
        //add()=>it throws an exception
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyaanka");
        enames.add("modi");
        System.out.println(enames);
        //offer()=>it does'nt throws an exception while adding elements(false/null)
        enames.offer("amith");
        enames.offer("yogi");
        System.out.println(enames);
        enames.remove("yogi");//remove() and poll() retrieve and remove elements from head
        System.out.println(enames);
       // System.out.println(enames.poll());
        System.out.println(enames.peek());
        //element()=>only read..if it is empty throws exception 
        //peek()=>if it is empty ...it display null
    }
}
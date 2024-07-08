package FI;
import java.util.*;
interface TestI{
    boolean test(List list);
}
class TestImpl implements TestI {
    public boolean test(List list) {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        TestImpl test1 = new TestImpl();
        System.out.println(test1.test(enames));
    }
}

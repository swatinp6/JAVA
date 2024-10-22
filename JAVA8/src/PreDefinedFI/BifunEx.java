package PreDefinedFI;

import java.util.function.BiFunction;

interface TestI{
    int apply(String fname,String lname);
}
class BifunSupplierEx implements TestI{
    public int apply(String fname,String lname) {
        return fname.length()+lname.length();
    }

    public static void main(String[] args) {
        TestI t=new BifunSupplierEx();
        System.out.println(t.apply("Swati","Patil"));
        //lambda function(UserDefined FI)
        TestI obj=((fname, lname) ->(fname.length()+lname.length()));
        System.out.println(obj.apply("Preeti","Magadum"));
        //With PreDefined BiFunction
        BiFunction<String,String,Integer> fun=(f, l) -> (f+l).length();
        System.out.println(fun.apply("Rahul","Gandhi!!!"));
    }

}

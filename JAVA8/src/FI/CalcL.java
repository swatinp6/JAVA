package FI;
@FunctionalInterface
interface Calc{
    public abstract int add(int a, int b);
}

public class CalcL {
    public static void main(String[] args) {
        Calc obj=(a,b)->a+b;
        System.out.println(obj.add(10,20));
    }
}

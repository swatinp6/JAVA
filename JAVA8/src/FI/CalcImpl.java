package FI;
@FunctionalInterface
interface CalcI{
    public abstract int add(int a, int b);
}
class CalcImpl implements CalcI {
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        CalcI cal1=new CalcImpl();

        System.out.println(cal1.add(100,2));
    }
}

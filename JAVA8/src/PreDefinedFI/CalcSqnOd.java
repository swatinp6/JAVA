package PreDefinedFI;

import java.util.function.Predicate;
public class CalcSqnOd {
    public static void main(String[] args) {
        Predicate<Integer> p=num->num%2==0;//when we need input to be true OR  false
        System.out.println(p.test(5));

    }
}

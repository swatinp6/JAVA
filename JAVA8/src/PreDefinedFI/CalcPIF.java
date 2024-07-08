package PreDefinedFI;
import java.util.function.Function;

class CalcPIF
{
    public static void main(String[] args) {
        Function<Integer,Integer> ci=num->num*num;//if we need different output i.e value
        System.out.println(ci.apply(10));
    }
}

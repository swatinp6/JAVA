package FI;
@FunctionalInterface//to execute lambda function ()->{}
interface SqIn{
    public abstract int sqaureI(int num);
}
class SquareLambda
{
    public static void main(String[] args) {
        SqIn squ=num->num * num;
        System.out.println(squ.sqaureI(100));
    }

}

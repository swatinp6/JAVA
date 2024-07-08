package FI;

interface SqI{
    public abstract int sqaureI(int num);
}
class SquareImpl implements SqI
{
   public int sqaureI(int num) {
        return num*num;
    }
    public static void main(String[] args) {
        SquareImpl squ=new SquareImpl();
        System.out.println(squ.sqaureI(5));
    }

}

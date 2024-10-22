package StreamAPIs;
import java.util.ArrayList;

public class ArrayEx {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(101);
        num.add(102);
        num.add(103);
        num.add(104);
        System.out.println(num);
        ArrayList<Integer> even_numbers=new ArrayList<Integer>();
        for(Integer number:num){
            if(number%2==0){
                even_numbers.add(number);
                System.out.println(even_numbers);
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }
    }

}

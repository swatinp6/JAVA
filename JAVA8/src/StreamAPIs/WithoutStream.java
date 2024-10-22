package StreamAPIs;

import java.util.ArrayList;

public class WithoutStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(101);
        numbers.add(102);
        numbers.add(103);
        numbers.add(104);
        System.out.println(numbers);
        for(Integer number:numbers){
            if(number%2==0){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }
    }

}

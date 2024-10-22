package StreamAPIs;

import java.util.*;
import java.util.stream.*;

public class StreamEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(101);
        numbers.add(102);
        numbers.add(103);
        numbers.add(104);
        System.out.println(numbers);
        Stream st=Stream.of(numbers);
        List even_no=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        //List even_no=numbers.stream().filter(num->num%2==0).forEach(num-> System.out.println(num););
        System.out.println(even_no);
    }
}

package StreamAPIs;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayStreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //List evens=numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
        //with using stream
        long evens=numbers.stream().filter(number->number%2==0).count();
        System.out.println(evens);
       //without stream
        int no_even_number=0;
        for(int i=0;i<=numbers.size()-1;i++){
            if(numbers.get(i)%2==0){
                no_even_number++;
            }
        }
        System.out.println(no_even_number);
        List<Integer> even =new ArrayList<Integer>();
        for (Integer number:numbers){
            if(number%2==0){
                even.add(number);
            }
        }
        System.out.println(even);
    }
}

package Optionalcls;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //String s1="Rahul";//RAHUL
        String s1=null;
        Optional op=Optional.ofNullable(s1);//Optional cls:to avoid NULL pointer exception
        if(op.isPresent()){
            System.out.println(op.get().toString().toUpperCase());
        }
        else{
            //System.out.println(op.isPresent());//false
            System.out.println("It's Null");
        }
    }
}

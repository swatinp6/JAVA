package DateandTime;

import java.time.Year;

public class LeapyearDemo {
    public static void main(String[] args) {
        //System.out.println(Year.now().isLeap()); //true
        //System.out.println(Year.of(1983).isLeap());
        Year year = Year.of(2023);
        //System.out.println(year.isLeap());
        if(year.isLeap()){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

package DateandTime;

import java.time.Year;

public class Leapyear {
    public static void main(String[] args) {
        //int year= Year.now().getValue();
        int year = Year.of(2023).getValue();
        System.out.println(year);
        if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

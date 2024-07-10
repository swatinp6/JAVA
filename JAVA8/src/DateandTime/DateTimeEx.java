package DateandTime;

import java.time.*;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        LocalDateTime ldt=LocalDateTime.now();
        LocalTime lt=LocalTime.now();
        System.out.println(ld);
        System.out.println(ldt);
        System.out.println(lt);
        //how to construct date of birth
        LocalDate dob=LocalDate.of(2002,02,05);
        System.out.println(dob);
        System.out.println(Month.of(2));
        System.out.println(Year.of(2002));

    }
}

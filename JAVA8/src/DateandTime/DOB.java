package DateandTime;

import java.time.LocalDate;
import java.time.Period;

public class DOB {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        LocalDate ld1=LocalDate.of(2002,2,5);
        Period p=Period.between(ld1,ld);
        System.out.println(p.getYears() + "Years " + p.getMonths()+"Months " + p.getDays()+"Days");
    }
}

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.Temporal;

public class date1 {
    public static void main(String args[]){
        System.out.println(DayOfWeek.FRIDAY.plus(4));
        LocalDate cd = LocalDate.now();
        System.out.println(cd);
        LocalDate sd = LocalDate.of(1989,05,06);
        System.out.println(sd);
        Period p = Period.between(sd, cd);
        System.out.println(p.getDays()+" Days "+p.getMonths()+" Months "+p.getYears());
        LocalTime now = LocalTime.now();
        LocalTime then = LocalTime.of(6,15);
        Duration d = Duration.between(now, then);
        System.out.println(now);
        System.out.println(then);
        System.out.println(d.abs());
    }
    
}

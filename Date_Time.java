import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        //LOCAL DATE
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate dob = LocalDate.of(1999,10,19);
        System.out.println(dob);

        LocalDate tommorrow = today.plusDays(1);
        System.out.println(tommorrow);

        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());


        //LOCAL TIME
        LocalTime now = LocalTime.now();
        String time = "02:30";
        LocalTime parsedTime = LocalTime.parse(time);
        System.out.println(parsedTime);

        // Local Date time
        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println(todayDateTime);
        LocalDateTime parsedDt =  LocalDateTime.parse("2026-04-05T13:45");
        System.out.println(parsedDt);

        // Zoned Date time
        ZonedDateTime IND = ZonedDateTime.now();
        System.out.println(IND);
        ZonedDateTime NYC = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(NYC);

        //instant
        long milliSec = System.currentTimeMillis();
        System.out.println(milliSec);
        Instant inst = Instant.now();
        System.out.println(inst);

        //Duration when we deal in hrs , mins .secs we use duration
        Instant t1 = Instant.now();
        Instant t2 = t1.plusMillis(1);
        Duration dur = Duration.between(t1,t2);
        System.out.println("Dur -> " + dur);


        //Period when we deal in big diff like days , months , years we use period
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2001 , 1,19);
        Period sinceBirth = Period.between(d1 ,d2);
        System.out.println(sinceBirth);

        //Date time formatter

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDTM = LocalDateTime.now().format(formatter);
        System.out.println(formattedDTM);
        LocalDate temp = LocalDate.parse(formattedDTM , formatter);
        System.out.println(temp);





    }
}

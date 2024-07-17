import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class CurrentDateTimeExample {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Current Date and Time with Timezone: " + currentZonedDateTime);

        ZonedDateTime currentZonedDateTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current Date and Time in Paris: " + currentZonedDateTimeInParis);
    }
}

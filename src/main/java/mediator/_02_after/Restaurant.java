package mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    public void dinner(Integer guestId, LocalDateTime dateTime) {
        System.out.println("dinner " + guestId + " " + dateTime);
    }
}

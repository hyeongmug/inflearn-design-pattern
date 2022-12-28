package mediator._02_after;

import java.time.LocalDateTime;

public class Guest {

    Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime localDateTime) {
        this.frontDesk.dinner(this, localDateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}

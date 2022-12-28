package buiilder;

import java.time.LocalDate;

public class BuilderMain {

    public static void main(String[] args) {
        TourPlan plan = new DefaultTourBuilder()
                .title("My Tour")
                .nightAndDays(3, 4)
                .startDate(LocalDate.of(2019, 1, 1))
                .whereToStay("Hotel")
                .addPlan(1, "Plan 1")
                .addPlan(2, "Plan 2")
                .addPlan(3, "Plan 3")
                .addPlan(4, "Plan 4")
                .getPlan();
    }
}

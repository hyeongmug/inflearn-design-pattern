package buiilder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
                .title("Cancun Trip")
                .nightAndDays(3, 4)
                .startDate(LocalDate.of(2019, 1, 1))
                .whereToStay("Hotel")
                .addPlan(1, "Plan 1")
                .addPlan(2, "Plan 2")
                .addPlan(3, "Plan 3")
                .addPlan(4, "Plan 4")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder
                .title("Long Beach Trip")
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

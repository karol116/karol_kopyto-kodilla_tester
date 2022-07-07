package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {
    public String checkIfSummer(MonthDay date) {
        if (date.isAfter(MonthDay.of(6, 20)) && date.isBefore(MonthDay.of(9, 24))) {
            return "Summer";
        }
        return "Nope";
    }
}
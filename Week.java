package weekdays;

public class Week {
    protected Day[] days;

    public Week() {
        days = Day.values();
    }

    public void displayAllDays() {
        System.out.println("All Days of the Week:");
        for (Day day : days) {
            System.out.println(day);
        }
    }
}

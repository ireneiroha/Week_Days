package weekdays;

public class WorkWeek extends Week {

    public void displayWorkDays() {
        System.out.println("Work Days:");
        for (int i = 0; i < 5; i++) {
            System.out.println(days[i]);
        }
    }
}

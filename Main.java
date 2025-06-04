package weekdays;

public class Main {
    public static void main(String[] args) {
        Week fullWeek = new Week();
        fullWeek.displayAllDays();

        System.out.println();

        WorkWeek workWeek = new WorkWeek();
        workWeek.displayWorkDays();
    }
}

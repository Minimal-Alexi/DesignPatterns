public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter calendarToNewDateAdapter = new CalendarToNewDateAdapter();
        printDate(calendarToNewDateAdapter);
        // Demonstrate setters
        calendarToNewDateAdapter.setDay(1);
        calendarToNewDateAdapter.setMonth(1);
        calendarToNewDateAdapter.setYear(1970);
        printDate(calendarToNewDateAdapter);

        calendarToNewDateAdapter.advanceDays(62);
        printDate(calendarToNewDateAdapter);
    }
    public static void printDate(CalendarToNewDateAdapter calendarToNewDateAdapter) {
        System.out.println("Current date: " + calendarToNewDateAdapter.getDay() + "."
                + calendarToNewDateAdapter.getMonth() + "." + calendarToNewDateAdapter.getYear());
    }
}

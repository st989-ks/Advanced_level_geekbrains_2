package taskForLesson_1.enums;

public class DayOfWeekMain {
    private static int workingHour= 8;
    private static DayOfWeek[] dayOfWeeks = DayOfWeek.values();

    public static void main(String[] args) {

        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));

    }
    static String getWorkingHours(DayOfWeek j){

        int n = 0;
        if (j.equals( DayOfWeek.SATURDAY ) || j.equals( DayOfWeek.SUNDAY )){
            return "Сегодня выходной";
        }else {
            for (int i = 0; i < dayOfWeeks.length; i++) {
                DayOfWeek dayOfWeek = dayOfWeeks[i];

                if (dayOfWeek.equals( j )){
                    workingHour = workingHour*5 - workingHour*n;
                    return "Сегодня "+ dayOfWeek + ". Осталось отработать "
                            + workingHour + " часов";
                }
                n++;

            }
        }
        return "Ошибка";
    }
}

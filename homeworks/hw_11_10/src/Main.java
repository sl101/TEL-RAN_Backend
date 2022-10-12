import java.util.Scanner;

//First level:
//        Есть устройство, на табло которого показывается количество секунд,
//        оставшихся до конца рабочего дня. Когда рабочий день начинается
//        ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
//        когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
//        а когда наступает 17 часов — на табло отображается «0»
//        (т.е. рабочий день закончился).

//        Требуется написать программу, которая будет получать из командной строки текущее время
//        (в одну переменную запишется количество текущих часов, в другую - количество текущих минут)
//        и определять суммарное количество секунд до конца дня, суммарное количество минут до
//        конца дня и суммарное количество часов до конца дня.

public class Main {
    public static void main(String[] args) {
        int userHours = requestUserHours();
        int userMinutes = requestUserMinutes();

        System.out.println("Сейчас " + userHours + ":" + userMinutes);

        int secondsLeft = getsecondsLeft(userHours, userMinutes);
        int minutesLeft = getMinutesLeft(secondsLeft);
        int hoursLeft = getHoursLeft(minutesLeft);
        int minutesRest = getMinutesRest(minutesLeft);

        showResult(secondsLeft, minutesLeft, hoursLeft, minutesRest);
    }
    private static void showResult(int secondsLeft, int minutesLeft, int hoursLeft, int minutesRest) {
        System.out.println("До конца рабочего дня остальось:\n" +
                hoursLeft + " ч " +
                minutesRest + " мин\n" +
                minutesLeft + " мин\n" +
                secondsLeft + " сек");
    }
    private static int getMinutesRest(int minutesLeft) {
        int minutesRest = minutesLeft %60;
        return minutesRest;
    }
    private static int getHoursLeft(int minutesLeft) {
        int hoursLeft = minutesLeft /60;
        return hoursLeft;
    }
    private static int getMinutesLeft(int secondsLeft) {
        int minutesLeft = secondsLeft /60;
        return minutesLeft;
    }
    public static int getsecondsLeft(int hours, int minutes){
        int result = (17-hours)*3600-(minutes*60);
        return result;
    }
    public static int requestUserHours(){
        String hoursRequest = "Введите который сечас час ( от 9 до 17 ): ";
        int innerArg = getInputData(hoursRequest);
           while(innerArg < 9 || innerArg > 17){
               System.out.println("Неверный период");
               innerArg = getInputData(hoursRequest);
           }
        return innerArg;
    }
    public static int requestUserMinutes(){
        String minutesRequest = "Введите минуты ( от 0 до 60 ): ";
        int innerArg = getInputData(minutesRequest);
           while(innerArg < 0 || innerArg > 60){
               System.out.println("Неверный период");
               innerArg = getInputData(minutesRequest);
           }
        return innerArg;
    }
    public static int getInputData(String data){
        System.out.println(data);
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}

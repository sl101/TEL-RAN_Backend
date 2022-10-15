import java.util.Scanner;

//First level:
// Создайте две переменные "isWeekend" и "isRain", значения которых можно получить из командной строки.
// Создайте переменную "canWalk", значение которой должно быть истинным, если это выходной день (isWeekend=true)
// и не идет дождь (isRain=false), и ложным (для переменной "canWalk" в любом другом случае.

//Second level:
// Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство. В результате алгоритм выводит сообщение true или false.
// Ваша программа должна иметь переменные Temperature1 и Temperature2, их можно получить из командной строки.

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Level 1" + ANSI_RESET);
        showLevelOne();
        System.out.println(ANSI_PURPLE + "Level 2" + ANSI_RESET);
        showLevelTwo();

    }
    // Level #1 ================================
    public static void showLevelOne() {
        boolean isWeekend = requestIsWeekend();
        boolean isRain = requestIsRain();
        boolean canWalk = requestCanWalk(isWeekend, isRain);
        showAnswer(canWalk);
        reapetRequest("levelOne");
    }
    private static boolean requestIsWeekend(){
        String isWeekendRequest = "Сегодня выходной день? (Y)";
        boolean innerArg = getInputData(isWeekendRequest);
        return innerArg;
    }
    private static boolean requestIsRain(){
        String isWeekendRequest = "Идет дождь? (Y)";
        boolean innerArg = getInputData(isWeekendRequest);
        return innerArg;
    }
    private static boolean getInputData(String data){
        System.out.println(data);
        Scanner scanner = new Scanner(System.in);
        String inner = scanner.next();
        if(inner.equals("y") || inner.equals("Y"))
            return true;
        else
            return false;
    }
    private static boolean requestCanWalk(boolean weekend, boolean rain){
        if(weekend && !rain)
            return true;
        else
            return false;
    }
    private static void showAnswer(boolean answer){
        if(answer)
            System.out.println(ANSI_GREEN + "Можно идти гулять!" + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "Сиди дома, пей чай..." + ANSI_RESET);
    }
    // Level #2 ================================
    public static void showLevelTwo(){
        int temperature1 = getTemperature(1);
        int temperature2 = getTemperature(2);
        boolean isWorksCorrectly = checkCorrectly(temperature1, temperature2);
        showResult(isWorksCorrectly);
        reapetRequest("levelTwo");
    }
    private static int getTemperature(int number){
        String tempRequest = "Введите температуру для колбы № " +number;
        System.out.println(tempRequest);
        String errorMessage = ANSI_RED + "Это не число" + ANSI_RESET;
        return takeFromScanner(errorMessage);
    }
    private static int takeFromScanner(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println(errorMessage);
            scanner = new Scanner(System.in);
        }
        int result = scanner.nextInt();
        return result;
    }
    private static boolean checkCorrectly(int temperature1, int temperature2){
        if(temperature1 > 100 && temperature2 < 100)
            return true;
        else return false;
    }
    private static void showResult(boolean result){
        if(result)
            System.out.println(ANSI_GREEN + "Все отлично!\nПрибор работает корректно..." + ANSI_RESET);
        else
            System.out.println(ANSI_RED+ "Опасность!\nНарушен температурный режим..."+ ANSI_RESET);
    }
    // Common =============================================
    private  static void reapetRequest(String level){
        System.out.println("Завершить программу? Y - да");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();
        if (!result.equals("y") && !result.equals("Y"))
            choiceLevel(level);
    }
    public static void choiceLevel(String level){
        switch (level){
            case "levelOne":
                showLevelOne();
                break;
            case "levelTwo":
                showLevelTwo();
                break;
            default:
                System.out.println("");
                break;
        }
    }
}

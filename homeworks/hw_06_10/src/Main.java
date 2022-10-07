import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showTaskOne();
        showTaskTwo();
        showTaskThree();
        showSecondLevel();

    }

    public static void showTaskOne(){
        String initialWord = inputWord();
        boolean isEven = true;
        while(isEven){
            if (initialWord.length() % 2 != 0) {
                System.out.println("Вы ввели слово из количества букв = " + initialWord.length());
                System.out.println("Количество букв должно быть четным");
                initialWord = inputWord();
            } else {
                System.out.println("Вы ввели слово из количества букв = " + initialWord.length());
                isEven = false;
            }
        }
        divideWord(initialWord);
    }

    public static String inputWord(){
        String precondition = "Введите слово из четного количества букв:";
        System.out.println(precondition);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static void divideWord(String value){
        int halfWord = value.length()/2;
        String firstHalfWord = value.substring(0, halfWord);
        String secondHalfWord = value.substring(halfWord, value.length());

        System.out.println("Первая половина слова: " + firstHalfWord);
        System.out.println("Вторая половина слова: " + secondHalfWord);
    }

    public static void showTaskTwo(){
        String preconditionOne = "Введите первое число:";
        System.out.println(preconditionOne);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String preconditionTwo = "Введите второе число:";
        System.out.println(preconditionTwo);
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        MathOperations operations = new MathOperations(a, b);
    }

    public static void showTaskThree(){
        double courseUsaToday = 0.98;
        String precondition = "Введите сумму для обмена(EUR):";
        System.out.println(precondition);
        Scanner scanner = new Scanner(System.in);
        double summEUR = scanner.nextInt();
        double resultUSA = changeСurrency( summEUR, courseUsaToday);
        System.out.println(summEUR+" EUR = " + resultUSA + " USA");
    }

    public static double changeСurrency(double summEUR, double course){
        double result = summEUR * course;
        return result;
    }

    public static void showSecondLevel(){
        int pizzaOne = 24;
        double squareOne = getSquare(pizzaOne);
        int pizzaTwo = 28;
        double squareTwo = getSquare(pizzaTwo);
        double result = 40*Math.abs(squareOne-squareTwo);
        System.out.println("В пицце диматром " + pizzaTwo +"см, \nна " + result + " каллорий больше, \nчем в пицце "+ pizzaOne + "см");
    }

    public static double getSquare(int diameter){
        int radius = diameter/2;
        double square = Math.PI*Math.pow(radius, 2);
        System.out.println(square);
        return square;
    }

}

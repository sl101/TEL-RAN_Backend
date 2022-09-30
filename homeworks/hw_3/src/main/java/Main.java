import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startFirstLevelOne();
        startFirstLevelTwo();

        startSecondLevel();
    }

    static void startFirstLevelOne(){
        System.out.println("Enter radius to calculate:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();
        double pi = 3.14;
        double result = pi*Math.pow(radius,2.0);
        System.out.println("The area of a circle with radius " + radius + " is " + result);
        System.out.println("============");
    }

    static void startFirstLevelTwo(){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello "+ userName + "!");
        System.out.println("============");
    }

    static void startSecondLevel(){
        String initial = new String("I study Basic Java!");
        System.out.println(initial);
        System.out.println("- last character of the line:");
        System.out.println(initial.charAt(initial.length()-1));
        System.out.println("- replacing all letters 'a' with '*':");
        System.out.println(initial.replace('a', '*'));
    }
}

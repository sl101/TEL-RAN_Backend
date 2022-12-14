/* First level: Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
        Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на каждые 5 этажей,
        он спускается на 1 этаж. Разработайте алгоритм, используя цикл for, с помощью которого
        Вы смогли бы определить за сколько таких итераций (1 итерация: 5 этажей вверх, 1 - вниз)
        можно добраться до самого верхнего этажа.
        Принимаем тот факт, что уровень земли это 0й этаж. А так же, если до верха остается менее 5 этажей,
        то лифт сможет проехать нужный ему промежуток. */

public class Main {
    static int defaultFloors = 163;
    static int increase = 4;

    public static void main(String[] args) {
        showResult(defaultFloors, increase);
    }

    private static void showResult(int defaultVar, int increase) {
        int iterations = countIterations(defaultVar, increase);
        System.out.println(iterations);
    }

    public static int countIterations(int floors, int increase) {
        int count = 0;
        for (int i = 0; i < floors; i = i + increase, count++) ;
        return count;
    }
}
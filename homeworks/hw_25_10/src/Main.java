public class Main {
    public static void main(String[] args) {

        int totalFloors = 163;
        int startFloor = 0;
        int increase = 5 - 1;

        showLoopWhile(totalFloors, increase, startFloor);
        showLoopDoWhile(totalFloors, increase, startFloor);
    }

    public static void showLoopWhile(int floors, int increase, int startFloor) {
        int iterations = 0;
        int count = startFloor;

        while (count < floors) {
            count += increase;
            iterations++;
        }

        System.out.println("There are " + iterations + " iterations in the \"While\" loop");
    }

    public static void showLoopDoWhile(int floors, int increase, int startFloor) {
        int iterations = 0;
        int count = startFloor;

        if (count < floors) {
            do {
                count += increase;
                iterations++;
            } while (count < floors);
        }

        System.out.println("There are " + iterations + " iterations in the \"DoWhile\" loop");
    }
}

public class Main {
    public static void main(String[] args) {
        startTaskZero();
        startTaskOne();
        startTaskTwo();
        startTaskThree();
        startTaskFour();
        startTaskFive();

    }

    static void startTaskZero() {
        System.out.println("\nПеревести число 478 из шестнадцатеричной в десятичную");

        int initial = 478;
        int result = (int) (4 * Math.pow(16, 2) + 7 * Math.pow(16, 1) + 8 * Math.pow(16, 0));

        System.out.println("\n" + initial + " = 16->10 = " + result);
        System.out.println("=======");
    }

    static void startTaskOne() {
        System.out.println("\nРазложить число 200345 на разряды в десятичной системе");

        System.out.println((int) (2 * Math.pow(10, 5)));
        System.out.println((int) (0 * Math.pow(10, 4)));
        System.out.println((int) (0 * Math.pow(10, 3)));
        System.out.println((int) (3 * Math.pow(10, 2)));
        System.out.println((int) (4 * Math.pow(10, 1)));
        System.out.println((int) (5 * Math.pow(10, 0)));

        System.out.println("=======");
    }

    static void startTaskTwo() {
        System.out.println("\nПеревести 637 из десятичной в шестнадцатеричную и обратно (10->16 и 16->10)");

        int decimal = 637;

        System.out.println("637/16 = " + decimal / 16); // 39
        System.out.println("остаток = " + decimal % 16);      // 13 = D
        System.out.println("39/16 = " + 39 / 16);  // 2
        System.out.println("остаток = " + 39 % 16);       // 7
        System.out.println("2/16 = " + 2 / 16);  // 0
        System.out.println("остаток = " + 2 % 16);       // 2

        String hexadecimal = "27D";

        System.out.println("\n" + decimal + " = 10->16 = " + hexadecimal);

        int decimalResult = (int) (2 * Math.pow(16, 2) + 7 * Math.pow(16, 1) + 0xD * Math.pow(16, 0));

        System.out.println(hexadecimal + " = 16->10 = " + (int) decimalResult);
        System.out.println("=======");
    }

    static void startTaskThree() {
        System.out.println("\nПеревести 637 из десятичной в двоичную");

        int decimal = 637;

        System.out.println("637/2 = " + decimal / 2);// 318
        System.out.println("остаток = " + decimal % 2);      // 1
        System.out.println("318/2 = " + 318 / 2);// 159
        System.out.println("остаток = " + 318 % 2);      // 0
        System.out.println("159/2 = " + 159 / 2);// 79
        System.out.println("остаток = " + 159 % 2);      // 1
        System.out.println("79/2 = " + 79 / 2);// 39
        System.out.println("остаток = " + 79 % 2);      // 1
        System.out.println("39/2 = " + 39 / 2);// 19
        System.out.println("остаток = " + 39 % 2);      // 1
        System.out.println("19/2 = " + 19 / 2);// 9
        System.out.println("остаток = " + 19 % 2);      // 1
        System.out.println("9/2 = " + 9 / 2);// 4
        System.out.println("остаток = " + 9 % 2);      // 1
        System.out.println("4/2 = " + 4 / 2);// 2
        System.out.println("остаток = " + 4 % 2);      // 0
        System.out.println("2/2 = " + 2 / 2);// 1
        System.out.println("остаток = " + 2 % 2);      // 0
        System.out.println("1/2 = " + 1 / 2);// 0
        System.out.println("остаток = " + 1 % 2);      // 1

        int result = 1001111101;

        System.out.println("\n" + decimal + " = 10->2 = " + result);
        System.out.println("=======");
    }

    static void startTaskFour() {
        System.out.println("\n11100111 перевести в десятичную");

        int initial = 11100111;

        int decimal = (int) (1 * Math.pow(2, 7) + 1 * Math.pow(2, 6) + 1 * Math.pow(2, 5) + 0 * Math.pow(2, 4) + 0 * Math.pow(2, 3) + 1 * Math.pow(2, 2) + 1 * Math.pow(2, 1) + 1 * Math.pow(2, 0));

        System.out.println("\n" + initial + " = 2->10 = " + decimal);
        System.out.println("=======");
    }

    static void startTaskFive() {
        System.out.println("\nПеревести 637 из десятичной в троичную");

        int decimal = 637;

        System.out.println("637/3 = " + decimal / 3); // 212
        System.out.println("остаток = " + decimal % 3);      // 1
        System.out.println("212/3 = " + 212 / 3); // 70
        System.out.println("остаток = " + 212 % 3);         // 2
        System.out.println("70/3 = " + 70 / 3); // 23
        System.out.println("остаток = " + 70 % 3);         // 1
        System.out.println("23/3 = " + 23 / 3); // 7
        System.out.println("остаток = " + 23 % 3);         // 2
        System.out.println("7/3 = " + 7 / 3); // 2
        System.out.println("остаток = " + 7 % 3);         // 1
        System.out.println("2/3 = " + 2 / 3); // 0
        System.out.println("остаток = " + 2 % 3);         // 2

        int result = 212121;

        System.out.println("\n" + decimal + " = 10->3 = " + result);
        System.out.println("=======");
    }


}

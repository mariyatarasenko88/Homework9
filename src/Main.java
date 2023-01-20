import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = 50000;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = 250000;
        for (int i = 0; i < arr.length; i++) {
            final int current2 = arr[i];
            if (current2 < min) {
                min = current2;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int middle = 0;
        for (int i = 0; i < arr.length; i++) {
            middle += arr[i] / 30;
        }
            System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
        }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }
    }

}

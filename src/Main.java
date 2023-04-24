import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = {1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        int[] three = new int[13];
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = {1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {7, 15, 4, 13, 18, 6, 9};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(three));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] one = {1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {7, 15, 4, 13, 18, 6, 9};

        for (int i = one.length - 1; i >= 0; i--) {
            if (i == one.length - 3)
                System.out.print(one[i]);
            else
                System.out.print(one[i] + ", ");
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            if (i == two.length - 3)
                System.out.print(two[i]);
            else
                System.out.print(two[i] + ", ");
        }
        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {
            if (i == three.length - 7)
                System.out.print(three[i]);
            else
                System.out.print(three[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] one = {7, 5, 8};
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}
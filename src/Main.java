public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf(i + " ");
        }
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf(i + " ");
        }
        System.out.println("задача 8");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("задача 9");
        contribution = 29000;
        total = 0;
        int depositInterest = 1;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            total = total + total * depositInterest / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }
}
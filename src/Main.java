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
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("задача 8");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("задача 9");
        contribution = 29000;
        double totalWithInterest = 0;
        int depositInterest = 1;
        for (int i = 1; i <= 12; i++) {
            totalWithInterest = totalWithInterest + contribution;
            totalWithInterest = totalWithInterest + totalWithInterest * depositInterest / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalWithInterest + " рублей");
        }
        System.out.println("задача 10");
        for (int i = 1; i <= 10; i++) {
            int table2 = 2 * i;
            System.out.println("2*" + i + "=" + table2);
        }

    }
}
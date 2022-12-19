public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("задание 1");
        int deposit = 15_000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000) {
            sum += deposit;
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
        }

        //task2
        System.out.println("задание 2");
        int number = 1;
        while (number <= 10) {
            if (number == 10) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
            number++;
        }
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        //task3
        System.out.println("задание 3");
        int population = 12_000_000;
        int newPepYear = 17 * population / 1000;
        int deathPepYear = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + newPepYear;
            population = population - deathPepYear;
            System.out.println("Год " + i + " , численность населения составляет " + population);
        }

        //task4,5
        System.out.println("задание 4,5");
        float vklad = 15_000;
        int monthNum = 1;
        while (vklad <= 12_000_000) {
            vklad = vklad + (vklad * 7) / 100;
            if (monthNum % 6 == 0) {
                System.out.println("За " + monthNum + " месяц, накопилось " + vklad);
            }
            monthNum++;
        }

        //task6
        System.out.println("задание 6");
        double vklad2 = 15_000;
        for (int i = 1; i <= 9 * 12; i = i + 6) {
            double sumNew = vklad2;
            vklad2 = (vklad2 * 1.07) * 6;
            System.out.println("За " + i + " месяц, накопилось " + sumNew);
        }

        //task7
        System.out.println("Задание 7");
        int friday = 7;
        for (int i = friday; i <= 31; i = i + 7) {
            System.out.println("пятница " + i + " число");
        }

        //task8
        System.out.println("задание 8");
        int thisYear = 2022;
        int beforeYear = thisYear - 200;
        int afterYear = thisYear + 100;
        for (int i = beforeYear; i <= afterYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
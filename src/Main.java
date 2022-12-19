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
    }
}
public class Main {
    public static void main(String[] args) {
//
        System.out.println("Домашнее задание 1.1");
        int sum = 0;
        int contributtion = 15000;
        int month = 1;
        while (sum < 2459000) {
            sum += contributtion + sum * 0.01;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            month++;
        }
        System.out.println("Домашнее задание 1.2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");

        }
        System.out.println();
        System.out.println("Домашнее задание 1.3");
        int totalStrength = 12_000_000;
        float totalMortality = (float) 8 / 1000;
        float fertility = (float) 17 / 1000;
        for (int x = 1; x < 11; x++) {
            totalStrength = Math.round(totalStrength * totalMortality) - Math.round(totalStrength * fertility) + totalStrength;

            System.out.println("Год " + x + ", численность населения составляет " + totalStrength);
        }
        System.out.println();
        System.out.println("Домашнее задание 2.1");

        int contributtion1 = 15_000;
        int month1 = 1;
        double procent = 0.07;
        while (contributtion1 < 12_000_000) {
            contributtion1 += contributtion1 * procent;

            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + contributtion1 + " рублей");
            month1++;
        }
        System.out.println();
        System.out.println("Домашнее задание 2.2");

        int contributtio2 = 15_000;
        int month2 = 1;
        double procent1 = 0.07;
        while (contributtio2 < 12_000_000) {
            contributtio2 += contributtio2 * procent1;
            if (month2 % 6 == 0)

                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + contributtio2 + " рублей");
            month2++;
        }
        System.out.println();
        System.out.println("Домашнее задание 2.3");

        int contributtio3 = 15_000;
        int month3 = 1;
        double procent2 = 0.07;
        while (month3 <= 9 * 12) {
            contributtio3 += contributtio3 * procent2;
            if (month3 % 6 == 0)

                System.out.println("Месяц " + month3 + " , сумма накоплений равна " + contributtio3 + " рублей");
            month3++;
        }
        System.out.println();
        System.out.println("Домашнее задание 2.4");

        int friday = 7;
        int totalDays = 31;
        while (friday < totalDays) {
            if (friday % 7 == 0)

                System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
            friday++;
        }
        System.out.println();
        System.out.println("Домашнее задание 3.1");

        int lastYear = 1822;
        int nextYear = 2122;
        for (int y = lastYear; y <= nextYear; y++) {
            if (y % 79 == 0)
                System.out.println(y);
        }
        System.out.println();
        System.out.println("Домашнее задание 3.2");

        for (int k = 1; k <11 ; k++) {
            System.out.println("2 * "+k+" = "+k*2);

        }

    }
}


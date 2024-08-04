public class Main {
    public static void main(String[] args) {System.out.println();
        System.out.println("Homework-2.2!");
        System.out.println();
        System.out.println("Задача 2.1.");
        byte b = -127;
        short s = -32768;
        int i = 2_147_483_647;
        long l = 9223372036854775807L;
        float f = 3.400000E+38f;
        double d = 1.7000000000000000E308;
        char a = 'a';
        boolean n = true;
        System.out.println("Значение переменной b с типом byte равно:" + b);
        System.out.println("Значение переменной s с типом short равно:" + s);
        System.out.println("Значение переменной i с типом int равно:" + i);
        System.out.println("Значение переменной l с типом long равно:" + l);
        System.out.println("Значение переменной f с типом float равно:" + f);
        System.out.println("Значение переменной d с типом double равно:" + d);
        System.out.println("Значение переменной a с типом char равно:" + a);
        System.out.println("Значение переменной n с типом boolean равно:" + n);

        System.out.println();
        System.out.println("Задача 2.2.");
        double d1 = 27.12;
        long l1 = 987_678_965_549L;
        float f1 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        int i1 = 27897;
        byte b1 = 67;
        System.out.println("Значение переменной b1 с типом byte равно:" + b1);
        System.out.println("Значение переменной s1 с типом short равно:" + s1);
        System.out.println("Значение переменной i1 с типом int равно:" + i1);
        System.out.println("Значение переменной l1 с типом long равно:" + l1);
        System.out.println("Значение переменной f1 с типом float равно:" + f1);
        System.out.println("Значение переменной s2 с типом double равно:" + s2);
        System.out.println("Значение переменной d1 с типом double равно:" + d1);

        System.out.println();
        System.out.println("Задача 2.3.");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short sheetsPaper = 480;
        int quantityPaper = sheetsPaper / (class1+class2+class3);
        System.out.printf("На каждого ученика рассчитано %d листов бумаги.", quantityPaper);
        System.out.println();

        System.out.println();
        System.out.println("Задача 2.4.");
        short perfomance2minutes = 16;
        int perfomanceMashine = perfomance2minutes/2;
        int perfomance20minutes = perfomanceMashine * 20;
        int perfomanceDay = perfomanceMashine * 60 *24;
        int perfomanceThreeDays = perfomanceDay * 3;
        long perfomanceMonth = perfomanceDay * 30L;
        System.out.printf("За %s машина произвела %d штук бутылок. \n", "20 минут", perfomance20minutes);
        System.out.printf("За %s машина произвела %d штук бутылок. \n", "День", perfomanceDay);
        System.out.printf("За %s машина произвела %d штук бутылок. \n", "Три дня", perfomanceThreeDays);
        System.out.printf("За %s машина произвела %d штук бутылок. \n", "Месяц", perfomanceMonth);

        System.out.println();
        System.out.println("Задача 2.5.");
        int totalTanksPaint = 120;
        int tankWhite = 2;
        int tankBraun = 4;
        int totalClass = totalTanksPaint / (tankWhite+tankBraun);
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски. \n",
                totalClass, totalClass*tankWhite,totalClass*tankBraun);

        System.out.println();
        System.out.println("Задача 2.6.");
        short gramsToKg = 1000;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;

        int amoundBanana = 5;
        int amoundMilk = 2;
        int amoundIceCream = 2;
        int amoundEgg = 4;
        int result = (weightBanana*amoundBanana)+(weightEgg*amoundEgg)+(weightMilk*amoundMilk)+(weightIceCream*amoundIceCream);
        long resultToKg = result / gramsToKg;
        System.out.println(resultToKg);

        System.out.println();
        System.out.println("Задача 2.7.");
        int needLoseWeight = 7;
        int grToKilogram = 1000;
        int needLoseGrams = needLoseWeight * grToKilogram;
        int minGramsOneDay = 250;
        int maxGramsOneDay = 500;
        int minDays = needLoseGrams / maxGramsOneDay;
        int maxDays = needLoseGrams / minGramsOneDay;
        int avgDays = (minDays+maxDays)/2;
        System.out.println("Минимальное количество дней: " + minDays);
        System.out.println("Максимальное количество дней: " + maxDays);
        System.out.println("Среднее количество дней: " + avgDays);

        System.out.println();
        System.out.println("Задача 2.8.");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        byte percent = 10;
        float newSalaryMultiply = 1 + (percent/100f);
        int newSalaryMasha = (int) (salaryMasha*newSalaryMultiply);
        int newSalaryDenis = (int) (salaryDenis*newSalaryMultiply);
        int newSalaryKristina = (int) (salaryKristina*newSalaryMultiply);
        int SalaryMashaYearDiff = (newSalaryMasha-salaryMasha) * 12;
        int SalaryDenisYearDiff = (newSalaryDenis-salaryDenis) * 12;
        int SalaryKristinaYearDiff = (newSalaryKristina-salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей."
                + "Годовой доход вырос на " + SalaryMashaYearDiff + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей."
                + "Годовой доход вырос на " + SalaryDenisYearDiff + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей."
                + "Годовой доход вырос на " + SalaryKristinaYearDiff + " рублей.");
    }
}
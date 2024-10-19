public class Main {
    public static void main(String[] args) {
        // Task 1
        int a = 654321;
        byte b = 127;
        short sh = -32000;
        long ln = 987654321;
        float f = 3.75f;
        double dbl = 3.418E01;
        System.out.println("Task 1");
        System.out.println("Значение переменной 'a' с типом 'int' равно " + a);
        System.out.println("Значение переменной 'b' с типом 'byte' равно " + b);
        System.out.println("Значение переменной 'sh' с типом 'short' равно " + sh);
        System.out.println("Значение переменной 'ln' с типом 'long' равно " + ln);
        System.out.println("Значение переменной 'f' с типом 'float' равно " + f);
        System.out.println("Значение переменной 'dbl' с типом 'double' равно " + dbl);
        //Task 2
        System.out.println("Task 2");
        long ln2 = 987678965549L;
        double dbl2 = 27.12;
        short sh2 = 569;
        int i2 = -159;
        short sh3 = 27897;
        byte b2 = 67;
        float fl2 = 2.786f;
        System.out.println(ln2);
        System.out.println(dbl2);
        System.out.println(sh2);
        System.out.println(i2);
        System.out.println(sh3);
        System.out.println(b2);
        System.out.println(fl2);
        // Task 3
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short allSheetsPaper = 480;
        int oneStudentSheets = allSheetsPaper / (studentsLP + studentsAS + studentsEA);
        System.out.println("Task 3");
        System.out.println("На каждого ученика расчитано " + oneStudentSheets + " листов бумаги");
        // Task 4
        System.out.println("Task 4");
        byte efficiencyTwoMin = 16;
        byte oneMin = 1;
        int twentyMin = oneMin * 20;
        int efficiencyOneMin = efficiencyTwoMin / 2;
        int efficiencyTwentyMin = efficiencyOneMin * twentyMin;
        System.out.println("За " + twentyMin + " минут(ы) машина произвела " + efficiencyTwentyMin + " штук бутылок");
        byte day = 1;
        int threeDays = day * 3;
        int efficiencyDay = efficiencyOneMin * 60 * 24;
        System.out.println("За " + day + " сутки(ок) машина произвела " + efficiencyDay + " штук бутылок");
        int efficiencyThreeDays = efficiencyDay * threeDays;
        System.out.println("За " + threeDays + " дня(ей) машина произвела " + efficiencyThreeDays + " штук бутылок");
        int efficiencyMonth28 = efficiencyDay * 28; // Февраль простого года
        int efficiencyMonth29 = efficiencyDay * 29; // Февраль високосного года
        int efficiencyMonth30 = efficiencyDay * 30; // Месяц 30 дней
        int efficiencyMont31 = efficiencyDay * 31; // Месяц 31 день
        System.out.println("За " + 1 + " месяц машина произвела " + efficiencyMonth28 + " штук буылок (февраль простого года)");
        System.out.println("За " + 1 + " месяц машина произвела " + efficiencyMonth29 + " штук бутылок (февраль високосного года)");
        System.out.println("За " + 1 + " месяц машина произвела " + efficiencyMonth30 + " штук бутылок (месяц 30 дней)");
        System.out.println("За " + 1 + " месяц машина произвела " + efficiencyMont31 + " штук бутылок (месяц 31 день)");
        // Task 5
        System.out.println("Task 5");
        int repair = 120;
        int roomWhitePot = 2;
        int roomBrownPot = 4;
        int roomPaint = roomWhitePot + roomBrownPot;
        int rooms = repair / roomPaint;
        int roomsWhite = roomWhitePot * rooms;
        int roomsBrown = roomBrownPot * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + roomsWhite + " банок белой краски и " + roomsBrown + " банок коричневой краски");
        // Task 6
        System.out.println("Task 6");
        int banan = 80;
        int milk = 105;
        int icecream = 100;
        double egg = 70;
        double breakfast = banan * 5 + milk * 2 + icecream * 2 + egg * 4;
        double breakfastKg = breakfast / 1000;
        System.out.println(breakfast + "г - спортивный завтрак в граммах");
        System.out.println(breakfastKg + "кг - спортивный завтрак в килограммах");
        // Task 7
        // System.out.println("Task 7");
        int lostOneDay1 = 250;
        int lostOneDay2 = 500;
        int totalLost1 = 7000 / lostOneDay1;
        int totalLost2 = 7000 / lostOneDay2;
        System.out.println(totalLost1 + " дней понадобится на похудение по 250 г в день");
        System.out.println(totalLost2 + " дней понадобится при похудении на 500 г в день");
        // Task 8
        System.out.println("Task 8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        double salaryHiM = salaryM + salaryM * 0.1;
        double salaryHiD = salaryD + salaryD * 0.1;
        double salaryHiK = salaryK + salaryK * 0.1;
        double incomeM = salaryM * 12;
        double incomeHiM = salaryHiM * 12;
        double differenceM = incomeHiM - incomeM;
        System.out.println("Маша теперь получает " + salaryHiM + " рублей. Годовой доход вырос на " + differenceM + " рублей.");
        double incomeD = salaryD * 12;
        double incomeHiD = salaryHiD * 12;
        double differenceD = incomeHiD - incomeD;
        System.out.println("Денис теперь получает " + salaryHiD + " рублей. Годовой доход вырос на " + differenceD + " рублей.");
        double incomeK = salaryK * 12;
        double incomeHiK = salaryHiK * 12;
        double differenceK = incomeHiK - incomeK;
        System.out.println("Кристина теперь получает " + salaryHiK + " рублей. Годовой доход вырос на " + differenceK + " рублей.");
    }
}
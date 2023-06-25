public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println ("Задача 1");
        byte a = 2;
        short b = 5;
        int c = 100;
        long d = 245L;
        float e = 14.56f;
        double f = 54.347;
        System.out.println (" Значение переменной с типом a равно " +  a);
        System.out.println (" Значение переменной с типом b равно " + b);
        System.out.println (" Значение переменной с типом c равно " + c);
        System.out.println (" Значение переменной с типом d равно " + d);
        System.out.println (" Значение переменной с типом e равно " + e);
        System.out.println (" Значение переменной с типом f равно " + f);
    }

    public static void task2 () {
        System.out.println ("Задача 2");
        float varOne = 27.12f;
        long varTwo = 987678965549L;
        double varThree = 2.786;
        int varFour = 569;
        short varFive = -159;
        short varSix = 569;
        byte varSeven = 67;
        System.out.println (varOne);
        System.out.println (varTwo);
        System.out.println (varThree);
        System.out.println (varFour);
        System.out.println (varFive);
        System.out.println (varSix);
        System.out.println (varSeven);
    }
    public static void task3 () {
        System.out.println ("Задача 3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        int allStudent = teacherLP + teacherAS + teacherEA;
        System.out.println (" Всего учеников " + allStudent);
        short paper = 480;
        int everyStudentPaper = paper / allStudent;
        System.out.println (" На каждого ученика расчитано " + everyStudentPaper + " листов бумаги ");

    }
    public static void task4 () {
        System.out.println ("Задача 4");
        byte bottle2Min = 16;
        byte time2Min = 2;
        int bottle1Min = bottle2Min / time2Min;
        byte time20Min = 20;
        int bottle20Min = time20Min * bottle1Min;
        System.out.println (" Производит " + bottle20Min + " бутылок за 20 минуту ");
        byte allDayHours = 24;
        int allDayMinutes = 60;
        int time1Day = allDayHours * allDayMinutes;
        int bottle1Day = bottle1Min * time1Day;
        System.out.println (" Производит " + bottle1Day + " бутылок за сутки ");
        byte now3Day = 3;
        int Minutes3Day = now3Day * time1Day;
        int bottle3Day = Minutes3Day * bottle1Min;
        System.out.println (" Производит " + bottle3Day + " бутылок за 3-е суток ");
        short now1Mounth = 356;
        int Minutes1Mounth = now1Mounth * allDayHours * allDayMinutes;
        int bottle1Mounth = Minutes1Mounth * bottle1Min;
        System.out.println (" Производит " + bottle1Mounth + " бутылок за месяц ");
    }
    public static void task5 () {
        System.out.println ("Задача 5");
        byte tinPaintAll = 120;
        byte tinWhitOneClass = 2;
        byte tinBrownOneClass = 4;
        int tinPaintClass = tinWhitOneClass + tinBrownOneClass;
        int classInSchool = tinPaintAll / tinPaintClass;
        int allWhiteTin = classInSchool * tinWhitOneClass;
        int allBrownTin = classInSchool * tinBrownOneClass;
        System.out.println (" В школе где " + classInSchool + " классов " + " нужно " + allWhiteTin + " банок белой краски " + " и " + allBrownTin + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println ("Задача 6");
        byte bananaForBrekfast = 5;
        byte weightBananaOne = 80;
        int weightBananaForBrekfast = bananaForBrekfast * weightBananaOne;
        int milkForBrekfast = 2;
        byte weightMilkForBrekfast = 105;
        int weightMilkAllBrekfast = milkForBrekfast * weightMilkForBrekfast;
        byte iceCreamForBreakfast = 2;
        byte weightIceCream = 100;
        int weightAllIceCream = iceCreamForBreakfast * weightIceCream;
        byte eggsForBrekfast = 4;
        byte weightEggs = 70;
        int weightEggsAll = eggsForBrekfast * weightEggs;
        int allBrekfast = weightBananaForBrekfast + weightMilkAllBrekfast + weightAllIceCream + weightEggsAll;
        System.out.println (" Вес завтрака составляет " + allBrekfast + " грамм ");
        int oneKg = 1000;
        int brekfastKg = allBrekfast / oneKg;
        System.out.println (" Вес завтрака составляет " + brekfastKg + " киллограмм ");
    }
    public static void task7 () {
        System.out.println ("Задача 7");
        byte weightSportsmen = 7;
        int oneKg = 1000;
        int weightSportsmenGr = weightSportsmen * oneKg;
        int lostOne = 250;
        int lostTwo = 500;
        int lostOneDay = weightSportsmenGr / lostOne;
        int lostTwoDay = weightSportsmenGr / lostTwo;
        System.out.println (" Если спортсмен уменьшит еду на 250 гр то похудет за " + lostOneDay + " дней ");
        System.out.println (" Если спортсмен уменьшит еду на 250 гр то похудет за " + lostTwoDay + " дней ");
    }
    public static void task8 () {
        System.out.println ("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int raise = 10;
        int integer = 100;
        int raiseSalaryMashaMounth = salaryMasha * raise / integer + salaryMasha;
        int yearMounth = 12;
        int raiseSalaryMashaYear = raiseSalaryMashaMounth * yearMounth;
        int beforeRaisenMashaYear = salaryMasha * yearMounth;
        int diffSalaryMasha = raiseSalaryMashaYear - beforeRaisenMashaYear;
        System.out.println ("Теперь Маша получает " + raiseSalaryMashaMounth + " в месяц, годовой доход увеличился на  " + diffSalaryMasha + " рублей");
        int raiseSalaryDenisMounth = salaryDenis * raise / integer + salaryDenis;
        int raiseSalaryDenisYear = raiseSalaryDenisMounth * yearMounth;
        int beforeRaisenDenisYear = salaryDenis * yearMounth;
        int diffSalaryDenis = raiseSalaryDenisYear - beforeRaisenDenisYear;
        System.out.println ("Теперь Денис получает " + raiseSalaryDenisMounth + " в месяц, годовой доход увеличился на  " + diffSalaryDenis + " рублей");
        int raiseSalaryKristinaMount = salaryKristina * raise / integer + salaryKristina;
        int raisenSalaruKrisYear = raiseSalaryKristinaMount * yearMounth;
        int beforeRaiseKrisYear = salaryKristina * yearMounth;
        int diffSalaryKris = raisenSalaruKrisYear - beforeRaiseKrisYear;
        System.out.println ("Теперь Кристина получает " + raiseSalaryKristinaMount + " в месяц, годовой доход увеличился на  " + diffSalaryKris + " рублей");

    }

}
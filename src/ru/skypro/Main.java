package ru.skypro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // TASK 1
        int clientOS = 0; //0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        } else {
            System.out.println("ВНИМАНИЕ! Неверное наименование ОС!");
        }

        //TASK 2
        int clientDeviceYear = 2010;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
        } else {
            System.out.println("ВНИМАНИЕ! Неверные данные");
        }

        //TASK 3
        int year = 1200;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
//
        //TASK 4
        int deliveryDistanceKm = 100;

        if (deliveryDistanceKm < 20) {
            System.out.println("На доставку потребуется 1 день.");
        } else if (deliveryDistanceKm >= 20 && deliveryDistanceKm < 60) {
            System.out.println("На доставку потребуется 2 дня.");
        } else if (deliveryDistanceKm >= 60 && deliveryDistanceKm < 100) {
            System.out.println("На доставку потребуется 3 дня.");
        } else {
            System.out.println("Доставить не сможем.");
        }


        //TASK 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ОСЕНЬ");
                break;
            default:
                System.out.println("ТАКОГО МЕСЯЦА НЕ СУЩЕСТВУЕТ");
        }

        //START TASK 6
        int age = 31;
        int salary = 88_000;
        double salaryCoefficient50 = 1.2;
        double salaryCoefficient80 = 1.5;
        if (age <= 23 && age > 18 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей");
        } else if (age <= 23 && age > 18 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * salaryCoefficient50 + " рублей");
        } else if (age <= 23 && age > 18 && salary > 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * salaryCoefficient80 + " рублей");
        } else if (age > 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
        } else if (age > 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * salaryCoefficient50 + " рублей");
        } else if (age > 23 && salary > 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * salaryCoefficient80 + " рублей");
        } else
            System.out.println("Обратитесь по достижении 18 лет!");

        //STAR TASK 7
        int wantedSum = 330_000;
        float basicRate = 0.1f;
        int basicPeriod = 12;
        float monthlyFeeCoefficient = 0.5f;

        if (age < 23 && age > 18) {
            basicRate += 0.01;
        } else if (age >= 23 && age < 30) {
            basicRate += 0.005;
        }
        if (salary > 80_000) {
            basicRate -= 0.007;
        }
        //System.out.println(basicRate);
        System.out.print("Максимальный платеж при зарплате " + salary + " рублей равен " +
                salary * monthlyFeeCoefficient + " рублей. Платеж по кредиту на запрашиваемую сумму составит " +
                (wantedSum + (wantedSum * basicRate)) / basicPeriod + " рублей. ");
        if (salary * monthlyFeeCoefficient > (wantedSum + (wantedSum * basicRate)) / basicPeriod) {
            System.out.println("КРЕДИТ ОДОБРЕН.");
        } else
            System.out.println("ОТКАЗАНО!!!");
    }
}

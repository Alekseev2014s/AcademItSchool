package ru.academits.alekseev.range;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Range range = new Range(3.2, 4.1);

        System.out.println("From = " + range.getFrom());
        System.out.println("To = " + range.getTo());
        System.out.println("Длина: " + range.getLength());

        System.out.println("Введите вещественное начальное чилос:");
        range.setFrom(scanner.nextDouble());
        System.out.println("Введите вещественное конечное чилос:");
        range.setTo(scanner.nextDouble());

        System.out.println("Введите вещественное чилос:");
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.println("Введённое число принадлежит отрезку");
        } else {
            System.out.println("Введённое число непринадлежит отрезку");
        }

    }
}

package ru.academits.alekseev.range;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Range range1 = new Range(3.2, 4.1);
        Range range2 = new Range(5, 7);

        System.out.println("From = " + range1.getFrom());
        System.out.println("To = " + range1.getTo());
        System.out.println("Длина: " + range1.getLength());

        System.out.println("Введите вещественное чилос:");
        double number = scanner.nextDouble();

        if (range1.isInside(number)) {
            System.out.println("Введённое число принадлежит отрезку");
        } else {
            System.out.println("Введённое число непринадлежит отрезку");
        }

        System.out.println("Интервал-пересечения: " + range1.getIntersection(range2));

        for (Range rangeItem : range1.getUnion(range2)) {
            System.out.printf("Результат объединения: %f, %f %n", rangeItem.getFrom(), rangeItem.getTo());
        }

        for (Range rangeItem : range1.getDifference(range2)) {
            System.out.printf("Результат разности: %f, %f %n", rangeItem.getFrom(), rangeItem.getTo());
        }
    }
}

package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        while (num <= 10) {
            num++;
            if (num == 10) {
                System.out.println(num);
                System.out.println("\n");
                break;
            }

            System.out.print(num + " ");
        }

        for (; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
        }
        int firstFriday = 3;
        {
            for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
                System.out.println("Сегодня пятница, " + currentFriday + "ое число. " + "Необходимо подготовить отчет.");
            }
        }
        int currentYear = 2021;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}







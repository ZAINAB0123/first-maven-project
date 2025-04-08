package ru.itgirl;

import java.util.Scanner;

public class DayOfTheWeek1 {
    public static void main(String[] args) {

        // Создаем сканер для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Массив с днями недели на английском
        String[] daysOfWeekEnglish = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        // Массив с днями недели на русском
        String[] daysOfWeekRussian = {
                "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"
        };
        // Попросим пользователя ввести день недели на английском
        System.out.println("Введите день недели на английском: ");
        String inputDay = scanner.nextLine().trim();

        // Переводим введенный день в нижний регистр для удобства сравнения
        inputDay = inputDay.substring(0, 1).toUpperCase() + inputDay.substring(1).toLowerCase();

        // Проверяем введенный день и выводим на русском
        boolean found = false;
        for (int i = 0; i < daysOfWeekEnglish.length; i++) {
            if (daysOfWeekEnglish[i].equals(inputDay)) {
                System.out.println("День недели на русском: " + daysOfWeekRussian[i]);
                found = true;
                break;
            }
        }

        // Если день недели не найден
        if (!found) {
            System.out.println("Неверное название дня недели. Попробуйте снова.");
        }

        // Закрытие сканера
        scanner.close();
    }
}




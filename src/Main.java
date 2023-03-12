/*
Написать метод, который принимает на вход значение промежутка времени в секундах.
Метод выводит на экран этот промежуток времени в виде часов минут и секунд, суток и недель.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд:");
        long sec_all = scanner.nextInt(); // общее количество минут
        time(sec_all);
    }
    static void time(long sec_all){
        long hour = sec_all / 3600; // общее количество суток
        int hour_ = (int)hour % 24; // количество часов с начала суток
        long days = (hour / 24) % 7; // количество суток с начала недели
        long week = hour / 168; // количество недель
        long min = (sec_all - hour * 3600) / 60; // количество минут с начала часа
        long sec = sec_all % 60; // количество секунд с начала минуты
        System.out.println("Общее количество секунд " + sec_all + " представляет собой\n" + week + "w:" + days + "d:" +
                hour_  + "h:" + min + "m:" + sec + "s\n"
        + "где w - количество недель,\nd - количество суток с начала недели,\nh - количество часов с начала суток,\n" +
                "m - количество минут с начала часа,\ns - количество секунд с начала минуты. ");
    }
}
package com.company;

public class Task3 {
    public static void main(String[] args) {
// 3 Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа (например, 123 перейдет в 213).
        System.out.println("Задание 3");
        System.out.print("Результат перестановки сотен и десятков - ");
        int number = 385;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int last = number % 10;
        System.out.println(tens + "" + hundreds + "" + last);
        //for (int n = 385; n <836; n++){
        //System.out.println(n);}
// 6 Дано трехзначное число. Определить, является ли его число десятков четным числом.
        System.out.println("Задание 6");
        int no = 783;
        int x = (no / 10) % 10;
        System.out.print(x +" - ");
        if (x == 2) {
            System.out.println("Четное");
        } else if (x == 4) {
            System.out.println("Четное");
        } else if (x == 6) {
            System.out.println("Четное");
        } else if (x == 8) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

// 9 Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        System.out.println("Задание 9");
       int no1 = 6745988;
       int hundred = no1 / 100 %10;
        System.out.println("Число сотен - " + hundred);

// 12 Дано трехзначное число. Округлить его до сотен.
        int y = 735;
        int round = y / 100 *100;
        System.out.println("Округление до сотен - " +round);
    }
}
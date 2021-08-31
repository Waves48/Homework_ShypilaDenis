package com.company;

public class Task1 {
    public static void main(String[] args) {
// 2. инструкция, приписывающая переменной summ нулевое значение
               int summ = 0;
        System.out.println("Переменная Summ = "+summ);
// 4. инструкция, уменьшающая на 2 значение переменной counter
               int counter = 6;
               int two = 2;
               int result = counter - two;
        System.out.println("Переменная counter минус 2 = "+result);
// 6. Записать в виде инструкции присваивания формулу вычисления значения функции y = -2,7x^3 + 0,23x^2 - 1,4
               double x = 8;
               double y = -2.7*x*x*x + 0.23*x*x - 1.4;
        System.out.println("Вычисление формулы  = "+y);
// 8. Записать в виде инструкции присваивания формулу пересчета веса из фунтов в кило (1 фунт - 0,4059 кг).
               double kg = 500;
               double pound = kg*2.205;
        System.out.print("500 кг = "+pound);
        System.out.println(" фунтов");
// 10 Записать в виде присваивания формулу вычисления площади треугольника - S = 2R2 sin A sin B sin C ,
               double A = 60;
               double B = 60;
               double C = 60;
               double R = 4;
               double S = 2*R*R*Math.sin(Math.toRadians(A))*Math.sin(Math.toRadians(B))*Math.sin(Math.toRadians(C));
        System.out.println("Площадь треугольника = "+S);
        // 12 Записать в виде инструкции присваивания формулу вычисления площади трапеции - 1/2 * (a+b) *h/2;
               int top = 10;
               int bottom = 12;
               int h = 7;
               int temp = top + bottom;
               double Square = 0.5 * temp * h / 2;
        System.out.println("Площадь трапеции = "+Square);
// 14 Записать в виде инструкции присваивания формулы вычисления площади поверхности и объема цилиндра 1) 2πr(r + h) 2) V = S*h
               double Pi = Math.PI;
               double radius = 30;
               double height2 = 40;
               double S_bottom = radius * radius * Pi;
               double S_full = 2 * Pi * radius * (radius + height2);
               double Cylinder_Volume = S_bottom * height2;
        System.out.println("Площадь поверхности цилиндра = "+S_full);
        System.out.println("Объем цилиндра = "+Cylinder_Volume);
// 16 Объявить необходимые переменные и записать в виде инструкции присваивания формулы вычисления объема и площади поверхности шара
// Площадь поверхности S=4πr^2; Объем V=4/3*pi*R^3
        double Sphere_radius = 44;
        double Sphere_square = 4 * Pi * Sphere_radius * Sphere_radius;
        double Sphere_volume = 4 / 3 * Pi * Sphere_radius * Sphere_radius * Sphere_radius;
        System.out.println("Площадь поверхности шара = " + Sphere_square);
        System.out.println("Объем шара = " + Sphere_volume);
// 18 Записать в виде инструкции присваивания формулу вычисления объема полого цилиндра.
        // V = pi * (d*δ+δ^2)*h, d - диаметр, δ - толщина стенки, h - высота.
        double diameter = 8;
        double thickness = 9;
        double Height = 17;
        double Hollow_volume = Pi * (diameter*thickness+thickness*thickness) * Height;
        System.out.println("Объем полого цилиндра = "+Hollow_volume);
// 20 Записать в виде инструкции присваивания формулу пересчета температуры из градусов Фаренгейта в градусы Цельсия: C = 5/9(F-32).
// (30°C × 9/5) + 32 = 86°F
        int Cel = 27;
        int Far = (Cel * 9/5) + 32;
        System.out.println(Cel + " градусов Цельсия = " + Far + " градусов Фаренгейта" );
// 22 Записать в виде инструкции присваивания формулу вычисления сопротивления электрической цепи, состоящей из двух параллельно соединенных резисторов
// RT = 1 / (1/R1 + 1/R2 + 1/R3 + 1/Rn..)
        double R1 = 5;
        double R2 = 7;
        double RT = 1 / (1/R1 + 1/R2);
        System.out.println("Сопротивление параллельно соединенных резисторов = "+RT);
    }
}

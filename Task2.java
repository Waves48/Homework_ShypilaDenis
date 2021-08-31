public class Task2 {
public static void main(String[] args){
    //2. Загадать двузначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную.
int decimal_2chars = 98;
String hex = Integer.toHexString(decimal_2chars);
String binary = Integer.toBinaryString(decimal_2chars);
    System.out.println("Задание 2:");
    System.out.println("Двухзначное число в двоичной системе - " + decimal_2chars);
    System.out.println("Преобразование в двоичную систему - " + binary);
    System.out.println("Преобразование в 16-ричную систему - " + hex);
    System.out.println(" ");
    //4. Загадать 6-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
String binary_6char = "110011";
int decimal = Integer.parseInt(binary_6char, 2);
String hex2 = Integer.toHexString(decimal);
    System.out.println("Задание 4");
    System.out.println("6-значное число в двоичной системе - " +binary_6char);
    System.out.println("Преобразование в 16-ричную систему - " +hex2);
    System.out.println("Преобразование в десятичную систему - " +decimal);
    System.out.println(" ");
    // 6. Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
    System.out.println("Задание 6");
    String hexanumber = "FACF";
    int decimal_number = Integer.parseInt(hexanumber, 16);
    String binary_number = Integer.toBinaryString(decimal_number);
    System.out.println("4-значное число в 16-ричной системе - " + hexanumber);
    System.out.println("Преобразование в двоичную систему - " + binary_number);
    System.out.println("Преобразование в десятичную систему - " + decimal_number);

}
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание №1

        System.out.println("Добро пожаловать в конвертор температуры по Цельсию в температуру по Фаренгейту.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение в градусах Цельсия: ");
        double TC = scanner.nextDouble();

        double TF = (double) (TC * 9/5) + 32;

        System.out.printf("Градусов по Фарингейту: %-5.2f%n", TF);
    }
}
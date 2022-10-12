import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выбрать нужное: ");
            System.out.println("1. Простой калькулятор. ");
            System.out.println("2. Вычисление квадратного уравнения. ");
            System.out.println("exit Выход из калькулятора. ");
            int num_4 = scanner.nextInt();
            if (num_4 > 2) {
                System.out.println("Что-то явно не так( ");
            } else {
                if (num_4 < 1) {
                    System.out.println("Что-то явно не так( ");
                } else {
                    double num_5 = 0;
                    if (num_4 > 1) {
                        System.out.println("Введите число a * x²: ");
                        int num_1 = scanner.nextInt();
                        System.out.println("Введите число b * x: ");
                        int num_2 = scanner.nextInt();
                        System.out.println("Введите число c: ");
                        int num_3 = scanner.nextInt();
                        System.out.println(num_1 + "*" + "x²" + " + " + num_2 + "*" + "x" + " + " + num_3);
                        double D = num_2 * num_2 - 4 * num_1 * num_3;
                        if (D > 0) {
                            double x1 = (-num_2 + Math.sqrt(D)) / 2 * num_1;
                            double x2 = (-num_2 - Math.sqrt(D)) / 2 * num_1;
                            System.out.println("X₁: " + x1);
                            System.out.println("X₂: " + x2);
                        } else {
                            if (D < 0) {
                                System.out.println("Что-то явно не так( ");
                            } else {
                                double x1 = -num_2 / 2 * num_1;
                                System.out.println("X₁: " + x1);
                            }
                        }
                    } else {
                        if (num_4 <= 1)
                            System.out.println("Введите первое число: ");
                        int num_1 = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int num_2 = scanner.nextInt();
                        System.out.println("Укажите действие: ");
                        char operation = scanner.next().charAt(0);
                        System.out.println(num_1 + " " + operation + " " + num_2);
                        if (operation == '+') {
                            num_5 = num_1 + num_2;
                        } else {
                            if (operation == '-') {
                                num_5 = num_1 - num_2;
                            } else {
                                if (operation == '*') {
                                    num_5 = num_1 * num_2;
                                } else {
                                    if (operation == '/') {
                                        num_5 = num_1 / num_2;
                                    } else {
                                        System.out.println("Что-то явно не так( ");
                                        continue;
                                    }
                                }
                            }
                        }
                        System.out.println("Ответ: " + num_5);
                    }
                }
            }
        }
    }
}
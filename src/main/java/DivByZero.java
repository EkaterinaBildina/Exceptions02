//Напишите программу, которая запрашивает у пользователя два числа
// и выполняет их деление. Если второе число равно нулю,
// программа должна выбрасывать исключение
// DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.

import java.io.InvalidClassException;
import java.util.Scanner;

public class DivisionByZero extends Exception{
    public static void main(String[] args) {

        //блок ввода числа1 пользователем в терминал
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please input number: ");
        int inputNum1 = scanner1.nextInt();

        //блок ввода числа2 пользователем в терминал
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please input number: ");
        int inputNum2 = scanner2.nextInt();


        // блок обработки исключения
        try {
            numChecking(inputNum1, inputNum2);
            System.out.println("It's OK!");
        } catch (DivisionByZero exception) {
            System.out.println(exception.getMessage());
        }


    }

    // создание исключения в случае выполнения условия
    public static void numChecking(int num1, int num2) throws DivisionByZero{
        double result = num1 / num2;
        if (num2 == 0) {
            throw new DivisionByZero("Incorrect number!");
        } else System.out.println(result);
    }

}

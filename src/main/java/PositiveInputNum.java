import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.util.Scanner;

public class Task201 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        try {
            if (inputNum > 0) {
                System.out.println("Число корректно!");
            }
        } catch (InvalidClassException e) {
            InvalidClassException(System.out.println("Некорректное число"));
            ;
        }


    }

    // Напишите программу, которая запрашивает у пользователя число
    // и проверяет, является ли оно положительным.
    // Если число отрицательное или равно нулю,
    // программа должна выбрасывать исключение InvalidNumberException
    // с сообщением "Некорректное число".
    // В противном случае, программа должна выводить сообщение "Число корректно".


}

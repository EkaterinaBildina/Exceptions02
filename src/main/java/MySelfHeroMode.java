import java.util.Scanner;

public class HeroMode extends RuntimeException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number1: ");
        int inputNum1 = scanner.nextInt();


        System.out.println("Please input number2: ");
        int inputNum2 = scanner.nextInt();

        System.out.println("Please input number3: ");
        int inputNum3 = scanner.nextInt();

        try {
            firstNumCheck(inputNum1);
            secondNumCheck(inputNum2);
            sumOfTwoNum(inputNum1, inputNum2);
            zeroNumCheck(inputNum3);

            System.out.println("Проверка пройдена успешно!");

        } catch (NumberOutOfRangeException exception) {
            System.out.println(exception.getMessage());
        } catch (NumberSumException exception3) {
            System.out.println(exception3.getMessage());
        } catch (DivisionByZeroException  exception4) {
            System.out.println(exception4.getMessage());
        }
    }


    public static void firstNumCheck(int num1) throws NumberOutOfRangeException {
        if (num1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
    }

    public static void secondNumCheck(int num2) throws NumberOutOfRangeException {
        if (num2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static int sumOfTwoNum(int num1, int num2) throws NumberSumException {
        int sum = num1 + num2;
        if (sum < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        return sum;
    }

    public static void zeroNumCheck(int num3) throws DivisionByZeroException {
        if (num3 == 0) {
            throw new DivisionByZeroException ("Деление на ноль недопустимо!");
        }
    }
}


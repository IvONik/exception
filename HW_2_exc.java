
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class HW_2_exc {
    public static void main(String[] args) throws Exception {
        // inputFloatNumber();
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // division(arr);
        // outOfBounds();
        checkNullString();
    }

    public static float inputFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите дробное число, через запятую");
        try {
            float floatNumber = scanner.nextFloat();
            if (floatNumber == Math.ceil(floatNumber)) {
                System.out.println("вы ввели целое число");
                return inputFloatNumber();
            }
            System.out.println("ваше число: " + floatNumber);
            return floatNumber;

        } catch (Exception e) {
            System.err.println("некорректный ввод");
            return inputFloatNumber();
        }

    }

    // Задание 2. Исправьте код.
    public static void division(int[] args) {
        try {
            int d = 0;
            int[] arr = new int[9];
            double catchedRes1 = arr[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    // Задание 3. Дан следующий код, исправьте его там, где требуется

    public static void outOfBounds() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // задание 4. Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void checkNullString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String string = reader.readLine();
        if (string.equals("") || string.equals(" "))
            throw new RuntimeException("Пустую строку вводить нельзя");
        //System.out.println(string);
    }
}

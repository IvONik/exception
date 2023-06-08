import java.util.Arrays;

public class HW_1 {

    public static void main(String[] args) {

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        // getArrayIndexOutOfBoundsException();
        // getNullPointerException();
        // getNumberFormatException();

        String[][] arr = new String[][] {
                { "1", "2", "3", "4", "5", "6" },
                { "1", "2", "3", "4", "5", "6" },
                { "1", "2", "3", "4", "5", "6" },

        };
        // sum2d(arr);

        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int[] array2 = new int[] { 1, 4, 3, 2, 1 };
        differenceArray(array1, array2);
        divisionArray(array1, array2);

    }

    public static void getArrayIndexOutOfBoundsException() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(array[5]);
    }

    public static void getNullPointerException() {
        String str = null;
        String stringX5 = str.repeat(3);
    }

    public static void getNumberFormatException() {
        String string = "1234aaa";
        System.out.println(Integer.parseInt(string));
    }

    // public static int sum2d(String[][] arr) {

    //     // 1.ArrayIndexOutOfBoundsException
    //     // 2.NullPointerException
    //     // 3.NumberFormatException

    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < 5; j++) {
    //             int val = Integer.parseInt(arr[i][j]);
    //             sum += val;
    //         }
    //     }
    //     System.out.println(sum);
    //     return sum;
    // }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива,
    // и возвращает новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] differenceArray(int[] array1, int[] array2) {
        int[] differenceArray = new int[5];
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы не равны");
        } else {

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    differenceArray[i] = array1[i] - array2[i];

                }
            }
            System.out.println(Arrays.toString(differenceArray));
            return differenceArray;
        }
    }

    // (Не обязательное)* Реализуйте метод, принимающий в качестве аргументов два
    // целочисленных массива,
    // и возвращает новый массив, каждый элемент которого равен частному элементов
    // двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно:
    // При выполнении метода единственное исключение, которое пользователь может
    // увидеть - RuntimeException, т.е. ваше.

    public static int[] divisionArray(int[] array1, int[] array2) {
        int[] divisionArray = new int[5];
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы не равны");
        } else {
            try {
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array2.length; j++) {
                        divisionArray[i] = array1[i] / array2[i];
                    }
                }
                System.out.println(Arrays.toString(divisionArray));
                return divisionArray;
            } catch (ArithmeticException e) {
                throw new RuntimeException("деление на ноль");
            }
        }
    }
}

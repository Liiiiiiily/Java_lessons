import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int sumOfIt = a + b;

        if (sumOfIt >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sumOfIt < 0) {
            System.out.println("Сумма отрицательная");
        }
        return;
    }

    public static void printColor() {
        int value = 7;

        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 100) {
            System.out.println("Зелёный");
        } if (value > 0 && value <=100) {
            System.out.println("Жёлтый");
        }
    }
// Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
// значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
// в противном случае “a < b”;
    public static void compareNumbers() {
        int a = -5;
        int b = 29;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

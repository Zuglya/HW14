import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        //todo Дописать логику работы метода сюда. Метод main не трогаем!!!
        double sum = 0;
        for(int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            sum += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        }
        return sum / String.valueOf(num).length(); //todo заменить 0 на корректный результат.
    }
}

package AndrLess;

import java.util.Random;
import java.util.Scanner;

//Этот класс делает сликом много работы. Смотри сейчас у него задачи:
//1. Создать сканер и вычитать строку с консоли
//2. Создать рандом класс и сгенерировать случайное число
//3. Распечатать число в консоль
// Необходимо разбить на 3 интерфейса: InputDataReader, RandomNumberGenerator(реализация с помощью класса Random, в будущем будет с помощью похода на random.org)
// и какой-то класс типо NumberOutputer/Printer( у него может быть несколько реализаций например текущая распечатать в консоль, потом сделаем запись в файл)
public class Rand implements  RandomNumbers{


    @Override
    public int numberOfRandomDigits() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        return number;
    }

    @Override
    public void printingNumbers(int amtNumbers) {
        Random myRandom = new Random();
        for (int i = 1; i <=amtNumbers ; i++) {
            int result = myRandom.nextInt(10);
            System.out.println(result);
        }
    }
}

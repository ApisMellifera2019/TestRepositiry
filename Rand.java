package AndrLess;

import java.util.Random;
import java.util.Scanner;

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

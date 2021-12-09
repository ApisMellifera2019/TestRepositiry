package AndrLess;

import java.util.Random;

public class Rand implements  RandomNumbers{


    @Override
    public int randomNumber() {
        Random myRandom = new Random();
        int number = myRandom.nextInt(10);
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

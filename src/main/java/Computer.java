import java.util.*;

public class Computer {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private static final int NUMBER_LENGTH = 3;

    Random random = new Random();
    String computerNumber="";

    public Computer(){

        while(computerNumber.length()<NUMBER_LENGTH) {
            int number = random.nextInt(MAX_RANGE) + MIN_RANGE;

            /* 3자리 수가 각각 다른 수가 될 수 있도록 만든다. */
            if (!computerNumber.contains(Integer.toString(number))){
                computerNumber += Integer.toString(number);
            }
        }

    }

}

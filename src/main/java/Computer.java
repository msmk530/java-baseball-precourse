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

            if (!computerNumber.contains(Integer.toString(number))){
                computerNumber += Integer.toString(number);
            }
        }
     System.out.println("생성된 난수는 : " + computerNumber);
    }
}

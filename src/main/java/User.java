import java.util.*;

public class User {

    Scanner sc = new Scanner(System.in);
    String userNumber="";

    public void selectNumber(){
        while(true) {
            System.out.println("숫자를 입력 하세요 : ");
            String number = sc.next();

            if(lengthOfNumber(number)&&correctNumber(number)&&overlapNumber(number)){
                userNumber = number;
                break;
            }else {
                System.out.println("형식에 맞지 않는 입력입니다. 중복되지 않는 세자리 정수를 입력해야합니다. ");
            }
        }

        System.out.println("유저가 입력한 숫자는 : " + userNumber);
    }


    /* 유저가 입력한 숫자가 3자리 숫자인지 */
    private boolean lengthOfNumber(String str){
        if(str.length()!=3){
            return false;
        }
        return true;
    }
    /* 유저가 입력한 숫자가 1~9 까지의 숫자인지 */
    private boolean correctNumber(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<'1' || str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    /* 유저가 입력한 숫자에 중복된 수가 있는지  */
    private boolean overlapNumber(String str){
        String temp;
        for(int i=0; i<str.length(); i++){
            temp = str.substring(i+1,str.length());

            if(temp.contains(Character.toString(str.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}

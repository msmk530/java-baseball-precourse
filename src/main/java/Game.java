public class Game {

    private Computer computer;
    private User user;

    public void start(){
        System.out.println("게임을 시작합니다. ");

        /* 게임이 시작될 때 마다 새로운 컴퓨터 객체를 통해 새로운 난수 생성*/
        computer = new Computer();

        /* 게임이 시작되면 유저객체를 만들어 숫자를 입력받는다. */
        user = new User();

        user.selectNumber();



    }
}

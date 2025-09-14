import java.util.Scanner;

public class Input {
    /**
     * User 클래스
     * 유저의 입력을 받아 OrderService에 전달해주는 클래스
     */

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}

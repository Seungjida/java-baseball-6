package others;

import static others.ExceptionHandling.restartException;

public class Others {
    public static boolean ifRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String restart = Console.readLine().trim().replaceAll(" ", "");
        return restartException(restart);
    }
}
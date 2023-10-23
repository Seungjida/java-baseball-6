package others;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Value {
    private static final int numberOfNumbers = 3;
    private static final int minRange = 1;
    private static final int maxRange = 9;

    public static List<Integer> computerGenerateNum() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < numberOfNumbers) {
            int randomNumber = Randoms.pickNumberInRange(minRange, maxRange);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public static List<Integer> playerGenerateNum(final String strNumber) {
        List<Integer> player = new ArrayList<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            int intNumber = strNumber.charAt(i) - '0';
            player.add(intNumber);
        }
        return player;
    }
}
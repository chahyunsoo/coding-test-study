import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static int solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int answer = 0;
        String intToString = Integer.toString(n);
        int x = intToString.length();
        List<String> list = new ArrayList<>();
        list.add("1");
        for (int i = 1; i < x; i++) {
            list.add("0");
        }
        String[] strings = list.toArray(new String[list.size()]);
        for (String s : strings) {
            stringBuilder.append(s);
        }
        int newNum = Integer.parseInt(stringBuilder.toString());

        while (newNum>0) {
            int value = n / newNum;
            answer += value;
            n = n % newNum;
            newNum /= 10;
        }
        return answer;
    }
}



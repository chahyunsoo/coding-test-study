import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
        int[] coinArr = {500, 100, 50, 10, 5, 1};
        int coinCount = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(bufferedReader.readLine());
        int returnAmount = 1000 - pay; //620
        for (int i=0; i < coinArr.length; i++) {
            coinCount += returnAmount / coinArr[i];
            returnAmount %= coinArr[i];
            if (returnAmount == 0) {
                break;

            }
        }
        System.out.println(coinCount);
    }
}
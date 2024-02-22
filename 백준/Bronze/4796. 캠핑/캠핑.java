import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int caseNumber =1;
        while (true) {
            String[] inputs = bufferedReader.readLine().split(" ");
            int L = Integer.parseInt(inputs[0]); //5
            int P = Integer.parseInt(inputs[1]); //8
            int V = Integer.parseInt(inputs[2]); //20
            if (L == 0 && P == 0 && V == 0) {
                break;
            }
            int temp = V / P;
            int answer = temp * L + Math.min((V % P),L);
            stringBuilder.append("Case ").append(caseNumber).append(": ").append(answer).append("\n");
            caseNumber++;
        }
        System.out.println(stringBuilder.toString());
    }
}

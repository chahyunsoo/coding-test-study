import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int stackNumber=0;
        while (N--> 0) {
            int inputExampleNumber = Integer.parseInt(bufferedReader.readLine());

            if (inputExampleNumber > stackNumber) {
                for (int i = stackNumber + 1; i <= inputExampleNumber; i++) {
                    stack.push(i);
                    stringBuilder.append("+\n");
                }
                stackNumber = inputExampleNumber;  //4 -> 6 -> 8
            } else if(stack.peek()!=inputExampleNumber) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            stringBuilder.append("-\n");
        }
        System.out.println(stringBuilder);
//        + + + + - - + + - + + - - - - -
    }
}


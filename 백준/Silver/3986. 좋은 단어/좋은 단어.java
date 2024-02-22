import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;

        while (N-- > 0) {
            Stack<Character> stack = new Stack<>();
            String answer = bf.readLine();
            for (int i = 0; i < answer.length(); i++) {
                char alphabet = answer.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(alphabet);
                }else {
                    if (stack.peek() == alphabet) {
                        stack.pop();
                    } else stack.push(alphabet);
                }
            }
            if (stack.isEmpty()) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
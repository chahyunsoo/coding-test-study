import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(bf.readLine());

        while (count-- > 0) {
            String input = bf.readLine(); // ( ( ) ) ( )
            for (int i = 0; i < input.length(); i++) {
                char gualho = input.charAt(i);
                if (gualho == '(') {
                    stack.push(input.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        stack.push(gualho);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES\n");
            } else sb.append("NO\n");
            stack.clear();
        }
        System.out.println(sb);
    }
}

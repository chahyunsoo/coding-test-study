import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr; 
    private static int topIndex = 0; 
    private static int currentStackSize = 0; 

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        int stackSize = Integer.parseInt(bufferedReader.readLine());
        arr = new int[stackSize];
        while (stackSize-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            switch (stringTokenizer.nextToken()) {
                case "push":
                    push(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case "top":
                    stringBuilder.append(top()).append('\n');
                    break;
                case "size":
                    stringBuilder.append(size()).append('\n');
                    break;
                case "empty":
                    stringBuilder.append(empty()).append('\n');
                    break;
                case "pop":
                    stringBuilder.append(pop()).append('\n');
                    break;
            }
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }

    public static void push(int pushItem) {
        arr[topIndex++] = pushItem;
        currentStackSize++;
    }

    public static int pop() {
        if (empty()==1) {
            return -1;
        } else {
            int tmp = arr[topIndex-1];
            arr[topIndex-1] = 0;
            topIndex--;
//            topIndex = topIndex - 1;
            currentStackSize--;
//            currentStackSize = currentStackSize - 1;
            return tmp;
        }
    }

    public static int size() {
        return currentStackSize;
    }

    private static int empty() {
        if (currentStackSize == 0) {
            return 1;
        } else return 0;
    }

    public static int top() {
        if (empty() == 1) {
            return -1;
        } else {
            return arr[topIndex-1];
        }
    }
}

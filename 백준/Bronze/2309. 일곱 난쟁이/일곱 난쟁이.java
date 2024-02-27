import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int heightSum = 0;
    static int[] arr = new int[9];
    static int w1, w2;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 9; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            arr[i] = inputNum;
            heightSum += arr[i];
        }
        Arrays.sort(arr);

        Loop1 :
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (heightSum - arr[i] - arr[j] == 100) {
                    w1 = arr[i];
                    w2 = arr[j];
                    break Loop1;
                }
            }
        }

        int newArr[] = new int[7];
        int index = 0;
        for (int i : arr) {
            if (i != w1 && i != w2) {
                newArr[index] = i;
                bw.write(String.valueOf(newArr[index])+'\n');
                index++;
            }
        }
        bw.close();
        br.close();
    }
}

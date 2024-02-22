import java.io.*;

public class Main {
    static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    static int length = 0;
    static boolean flag = true;
    public static void main(String[] args) throws IOException {
        String board = bufferReader.readLine();
        int N = board.length();
        String[] arr = board.split("\\.",-1);

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].length() % 2 == 0)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            for (int i = 0; i < arr.length; i++) {
                length = arr[i].length();

                while (true) {
                    if (length >= 4) {
                        bufferedWriter.write("AAAA");
                        length -= 4;
                    } else if (length >= 2) {
                        bufferedWriter.write("BB");
                        length -= 2;
                    } else break;
                }

                if (i < arr.length - 1) {
                    bufferedWriter.write(".");
                }
            }
        } else bufferedWriter.write("-1");

        bufferedWriter.close();
        bufferReader.close();
    }
}

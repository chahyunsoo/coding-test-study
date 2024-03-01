import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 1;
    static int zongMalNum = 666;
    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        while (true) {
            if (input == count) {
                bw.write(String.valueOf(zongMalNum));
                break;
            }
            zongMalNum++;
            if (String.valueOf(zongMalNum).contains("666")) {
                count++;
            }
        }
        br.close();
        bw.close();
    }
}

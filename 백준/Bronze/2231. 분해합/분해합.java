import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int constructor = 0;
        int inputNum = Integer.parseInt(bf.readLine());
        for (int i =1; i < inputNum; i++) {
            int result = i;
            int num = i;
            while (num > 0) {
                result += num % 10;
                num /= 10;
            }
            if (result == inputNum) {
                constructor = i;
                break;
            } 
        }
        bw.write(String.valueOf(constructor));
        bw.close();
        bf.close();
    }
}

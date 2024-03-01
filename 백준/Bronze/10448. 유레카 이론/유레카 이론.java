import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int inputSize;
    static int[] baseArr = new int[45];

    public static void main(String[] args) throws IOException {
        inputSize = Integer.parseInt(br.readLine());
        int[] checkArr = new int[inputSize];
        for (int i = 1; i < 45; i++) {
            baseArr[i] = (i * (i + 1)) / 2;
        }
        for(int i = 0; i < inputSize; i++) {
            checkArr[i] = Integer.parseInt(br.readLine());
            String s = String.valueOf(eureka(checkArr[i]));
            bw.write(s+'\n');
        }
        bw.close();
        br.close();
    }
    private static int eureka(int check) {
        if (checkSamGakSoo(check) == true) {
            return 1;
        } else return 0;
    }

    private static boolean checkSamGakSoo(int check) {
        for (int i = 1; i < 45; i++) {
            for (int k = 1; k < 45; k++) {
                for (int j = 1; j < 45; j++) {
                    if (baseArr[i] + baseArr[k] + baseArr[j] == check) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

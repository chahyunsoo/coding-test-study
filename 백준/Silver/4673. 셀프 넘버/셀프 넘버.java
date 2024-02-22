public class Main {
    static int[] arr = new int[10001];
    public static void main(String[] args) {
        for(int i=1; i<10001; i++){
            int n = self_number(i);
            if(n<10001) {
                arr[n] = 1;
            }

        }
        for(int i=1; i<10001; i++) {
            if (arr[i]==0) {
                System.out.println(i);
            }
        }}
    public static int self_number(int n){
        int sum=n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }}

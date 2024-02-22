import java.util.Scanner;
public class Main {
    static int m, n;
    static int N=1000000;
    static int[] arr=new int[N+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr[0] = 1;
        arr[1] = 1;
        sosu();
        for(int i =m; i<=n; i++){
            if(arr[i]==0) {
                System.out.println(i);
            }
        }
    }
    public static void sosu(){
        for(int i=2; i<=Math.sqrt(N); i++) {
            if(arr[i]==1){
                continue;
            }
            for(int j=i*i; j<=N; j+=i){
                arr[j]=1;
            }
        }
    }


}

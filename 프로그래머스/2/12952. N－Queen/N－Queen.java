class Solution {
    static int answer=0;
    static int[] arr;
    
    public int solution(int n) {
        arr=new int[n];
        queens(0,n);
        return answer;
    }
    public static void queens(int depth,int n) {
        if(depth==n){
            answer++;
            return;
        }
        else
            for(int i=0; i<n; i++){
                arr[depth]=i;
                if(promising(depth)){
                    queens(depth+1,n);
                }
            }
    }
    public static boolean promising(int depth){
        for(int i=0; i<depth; i++){
            if(arr[i]==arr[depth]){return false;}
            if(Math.abs(arr[i]-arr[depth])==Math.abs(i-depth)){return false;}
        }
        return true;
    }
}
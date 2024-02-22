class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int up=numer1*denom2+numer2*denom1;
        int down=denom1*denom2;
        int result=gcd(up,down);
        
        int[] answer = {up/result,down/result};
        return answer;
    }
    
    
}
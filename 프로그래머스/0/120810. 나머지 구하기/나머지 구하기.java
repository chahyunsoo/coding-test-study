class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        boolean var=((num1>0 && num1<=100) && (num1>0 && num2<=100));
        if(var){
            answer=num1%num2;
            return answer;
        }
        else
            return answer;
    }
}
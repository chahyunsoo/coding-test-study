class Solution {
    public int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            if((numbers[i]>=-10000 && numbers[i]<=10000) && (numbers.length>=1 && numbers.length<=1000)){
            numbers[i]=numbers[i]*2;
            }
        }
        return numbers;
    }
}

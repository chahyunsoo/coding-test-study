public class Solution {
    public static long solution(int price,int money,int count) {
        long result=0;
        /*
        count에 따라 이용금액 배가 되는 로직
        */
        for (long i = 1; i <= count; i++) {
            result += price * i;;
        }

        if (money < result) {
            return result - money;
        }
        else
            return 0;
        /*
        놀이기구를 count번 탔을때
        현재 내가 가지고 있는 금액에서
        얼마가 부족한지를 return
        금액이 부족하지 않으면 return 0
         */
    }
}
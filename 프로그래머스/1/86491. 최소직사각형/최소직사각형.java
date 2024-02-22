class Solution {
    public int solution(int[][] sizes) {
        int answer=0;
        int mw=0;
        int mh=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int a= sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=a;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(mw<sizes[i][0]){
                mw=sizes[i][0]; 
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(mh<sizes[i][1]){
                mh=sizes[i][1];
            }
        }
        answer=mw * mh;
        return answer;
        }
}
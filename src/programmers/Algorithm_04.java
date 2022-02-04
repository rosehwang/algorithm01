class Solution {

    public long solution(int w,int h) {

        long answer = 0L;

        long gcd = gcd(w, h);
        answer = (long)w * (long)h - ((long)w + (long)h - gcd);

        return answer;

    }

    private long gcd(int w, int h){

        if(w == 0) return h;
        return gcd(h % w, w);

    }

}

class Solution {
    /*CASE_1*/
    public int solution(String s) { 
        int answer = 0;

        for(int i=1; i<=(s.length()/2)+1; i++){//s가 9자리면 5번째까지 진행함.
            //문자열을 압축할수 있는 단어의 최대갯수 구하는것.
            int result = getSplitedLength(s, i, 1).length();
            answer = i==1 ? result : (answer>result?result:answer);             
        }
        return answer;
    }
    
    // s => 받은 문자열, n => 인덱싱(?), repeat => 반복횟수 
    public String getSplitedLength(String s, int n, int repeat){
        if(s.length() < n) return s;
        String result = "";
        String preString = s.substring(0, n);
        String postString = s.substring(n, s.length());

        // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
        if(!postString.startsWith(preString)){
            if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
            return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
        }

        return result += getSplitedLength(postString, n, repeat+1);//재귀함수 
    }
}
    
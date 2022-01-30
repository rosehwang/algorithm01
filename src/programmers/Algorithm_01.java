class Solution {
    public String[] solution(String[] record) {
        //[진행중]
        //일단 record가 입력받는 스트링 배열인거 같음.
        //1. record 배열을 잘려서 파악하기.
        //record[0][0].equlas("Enter") 들어왔습니다 .   str += str;
        String[] answer = {};
        String str_0 = "";
        String str_1 = "";
        String str_2 = "";
        
        for(int i=0; i<record.length; i++){
            String[] arr = record[i].split("\\s+");
                for(int n=0; n<arr.length; n++){
                    //띄어쓰기로 문자열 배열로 자름.                
                    if(n==0){
                       if(arr[n]=="Enter"){
                           str_2 += "들어왔습니다.";
                       }else{//Leave
                           str_2 += "나갔습니다.";
                       }  
                    }else if(n==1){//ID
                        str_1 += arr[n];
                    }else{//n==2 NAME
                        str_0 += arr[n];
                    } 
                }
            answer[i] = str_0 + "님이 " +str_2;
            
            //C1 > 동일한 ID로 있지만, 나갔다 들어올때 닉네임 바꿀경우.
            if(answer[i].contains(str_1)){
                
            }
            
            System.out.println("answer"+i+" :: {} "+answer[i]);
        }

        
        //C2 > Change를 써서 닉네임을 바꿀경우.
        
        
        return answer;
    }
}
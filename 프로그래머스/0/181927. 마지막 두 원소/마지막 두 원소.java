class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        
        int last = 0;
        
        if (num_list[len - 1] > num_list[len - 2]){
            last = num_list[len - 1] - num_list[len - 2];
        } else {
            last = num_list[len - 1] * 2;
        }
        
        for (int i = 0; i < len; i++){
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
        return answer;
    }
}
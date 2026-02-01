class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum1 = String.valueOf(a) + String.valueOf(b);
        
        int sum2 = 2 * (a * b);
        
        if (Integer.parseInt(sum1) > sum2) {
            answer = Integer.parseInt(sum1);
        } else if (Integer.parseInt(sum1) < sum2) {
            answer = sum2;
        } else {
            answer = Integer.parseInt(sum1);
        }
        
        return answer;
    }
}
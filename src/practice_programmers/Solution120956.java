package practice_programmers;

public class Solution120956 {
    public static void main(String[] args) {
        Solution120956 prob = new Solution120956();
        String[] s = {"ayaye", "uuuma", "ye", "woo", "yemawoo", "ayaa"};
        System.out.println(prob.solution(s));
    }
    public int solution(String[] babbling) {
        int answer = 0;
        for (String bab : babbling) {
            int[] occur = new int[4];
            while (!bab.isEmpty()) {
                if (bab.startsWith("aya")) {
                    if (occur[0]==1)
                        break;
                    else {
                        occur[0] = 1;
                        bab = bab.substring(3);
                    }
                }
                else if (bab.startsWith("ye")) {
                    if (occur[1]==1)
                        break;
                    else {
                        occur[1] = 1;
                        bab = bab.substring(2);
                    }
                }
                else if (bab.startsWith("woo")) {
                    if (occur[2]==1)
                        break;
                    else {
                        occur[2] = 1;
                        bab = bab.substring(3);
                    }
                }
                else if (bab.startsWith("ma")) {
                    if (occur[3]==1)
                        break;
                    else {
                        occur[3] = 1;
                        bab = bab.substring(2);
                    }
                }
                else
                    break;
            }
            if (bab.isEmpty())  answer++;
        }
        return answer;
    }
}
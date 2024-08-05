package practice_programmers;

public class Solution181928 {
    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};

        System.out.println(solution(num_list));
    }
    public static int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();
        for (int j : num_list) {
            if (j % 2 != 0) {
                oddNum.append(j);
            } else {
                evenNum.append(j);
            }
        }
        return Integer.parseInt(String.valueOf(evenNum)) + Integer.parseInt(String.valueOf(oddNum));
    }

}

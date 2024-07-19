package practices;
//https://school.programmers.co.kr/learn/courses/30/lessons/181929
//

public class Solution181292 {
    public static void main(String[] args) {
        int[] list1 = {3, 4, 5, 2, 1};
        int[] list2 = {5, 7, 8, 3};
        System.out.println(solution(list1));
        System.out.println(solution(list2));
    }

    public static int solution(int[] num_list) {
        int multiNums = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            multiNums *= num_list[i];
            sum += num_list[i];
        }
        return (multiNums < sum * sum ? 1 : 0);
    }
}
//    public static int solution1(int[] num_list) {
//
//    }

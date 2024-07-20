package practices;
//https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Solution181883 {
    public int[] solution(int[] arr, int[][] queries) {
//        for (int[] query : queries) {
//            int start = query[0];
//            int end = query[1];
//            for (int i = start; i <= end; i++) {
//                arr[i]++;
//            }
//        }
//        return arr;

        // use different Array:
        int n = arr.length;
        int[] diff = new int[n + 1];

        // 각 쿼리에 대해 차분 배열을 업데이트합니다.
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            diff[s] += 1;
            if (e + 1 < n) {
                diff[e + 1] -= 1;
            }
        }

        // 차분 배열을 이용하여 실제 배열 값을 업데이트합니다.
        int increment = 0;
        for (int i = 0; i < n; i++) {
            increment += diff[i];
            arr[i] += increment;
        }

        return arr;
    }
}


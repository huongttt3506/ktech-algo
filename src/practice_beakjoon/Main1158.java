package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.acmicpc.net/problem/1158
public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int[] josephus = josephus(n, k);
        String str = "<";
        for (int i = 0; i < n - 1; i++) {
            str += josephus[i] + ", ";
        }
        str += josephus[n - 1] + ">";
        System.out.println(str);
    }

    public static int[] josephus(int N, int K) {
        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            people.add(i + 1);
        }
        int[] joseArr = new int[N];
        int i = 0;
        int index = 0;
        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size();
            joseArr[i] = people.get(index);
            people.remove(index);
            i++;
        }
        return joseArr;
    }

    public int[] solution2(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        //arr contains removed element
        int[] joseArr = new int[N];
        int i = 0;
        int index = 0;
        while (!queue.isEmpty()) {
            //Move (K-1) elements from the beginning of the queue to the end of the queue
            for (int j = 0; j < K - 1; j++) {
                queue.add(queue.remove());
            }
            // Remove the Kth element and add it to the result
            joseArr[i] = queue.remove();
            i++;
        }
        return joseArr;
    }
}

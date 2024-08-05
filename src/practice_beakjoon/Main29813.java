package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/29813
public class Main29813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // Create queue as a linkedList to contain names and years data
        Queue<String> namesQueue = new LinkedList<>();
        Queue<Integer> yearsQueue = new LinkedList<>();

        // receive data
        for (int i = 0; i < n; i++) {
            String[] studentInfo = reader.readLine().split(" ");
            namesQueue.offer(studentInfo[0]);
            yearsQueue.offer(Integer.parseInt(studentInfo[1]));
        }
        while (yearsQueue.size() > 1) {
            int year = yearsQueue.poll();
            namesQueue.poll();
            for (int i = 0; i < year - 1; i++) {
                namesQueue.offer(namesQueue.poll());
                yearsQueue.offer(yearsQueue.poll());
            }
            namesQueue.poll();
            yearsQueue.poll();
        }

        // print name of the last student
        System.out.println(namesQueue.peek());

    }
}

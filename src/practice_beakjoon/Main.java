package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/28107
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // receive the total of number customers (n) and sushi dishes (m).
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // receive list of kind of sushi from customer 0 to n - 1:
        List<List<Integer>> orderList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = reader.readLine().split(" ");
            List<Integer> order = new ArrayList<>();
            for (String t : tmp) {
                order.add(Integer.parseInt(t));
            }
            orderList.add(order);
        }
        // List of served sushi
        String[] tmp = reader.readLine().split(" ");
        int[] sushi = new int[m];
        for (int i=0; i<m; i++){
            sushi[i] = Integer.parseInt(tmp[i]);
        }
        // count the total of number sushi dishes each customer ate.
        int[] answer = new int[n];
        int lastPerson = -1;
        for (int s: sushi) {
            if (lastPerson > 0) {
                List<Integer> order = orderList.get(lastPerson);
                if (order.contains(s)) {
                    answer[lastPerson]++;
//                    order.remove((Integer) s);
                    continue;
                }
            }
            for (int p= 0; p < n; p++) {
                if (p == lastPerson){
                    lastPerson = -1;
                    continue;
                }
                List<Integer> order = orderList.get(p);
                if (order.contains(s)) {
                    answer[p]++;
//                    order.remove((Integer) s);
                    lastPerson = p;
                    break;
                }
            }
        }
        for (int i=0; i<n-1; i++) {
            System.out.printf("%d ", answer[i]);
        }
        System.out.printf("%d", answer[n-1]);
    }
}
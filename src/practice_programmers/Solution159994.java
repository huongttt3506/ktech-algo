package practice_programmers;

import java.util.LinkedList;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Solution159994 {
    public static void main(String[] args) {
        String[] card1 = {"i", "water", "drink"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(card1, card2, goal));
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cards1Queue = new LinkedList<>();
        for (String string : cards1) {
            cards1Queue.offer(string);
        }
        Queue<String> cards2Queue = new LinkedList<>();
        for (String string : cards2) {
            cards2Queue.offer(string);
        }
        boolean isValid = true;
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1Queue.peek())) {
                cards1Queue.poll();
            } else if (goal[i].equals(cards2Queue.peek())) {
                cards2Queue.poll();
            } else isValid = false;
        }
        return isValid ? "Yes" : "No";
    }

}

package practice_programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181945
import java.util.Scanner;
public class Solution181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arrStr = a.split("");
        for (String c : arrStr) {
            System.out.println(c);
        }
    }

}

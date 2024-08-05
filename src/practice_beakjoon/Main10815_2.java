package practice_beakjoon;
//https://www.acmicpc.net/problem/10815
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main10815_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Read the total number of cards
        int n = Integer.parseInt(reader.readLine());

        //Read the numbers on the cards and store them in a set
        StringTokenizer st = new StringTokenizer(reader.readLine());
        Set<Integer> nSet = new HashSet<>();
        for (int i = 0; i< n; i++) {
            nSet.add(Integer.parseInt(st.nextToken()));
        }
         // Read the total number of numbers to test
        int m = Integer.parseInt(reader.readLine());

        //Read all the numbers we want to test
        st = new StringTokenizer(reader.readLine());
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(st.nextToken());
        }

        // Test if nSet contains each element of mArray and build the answer
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (nSet.contains(mArray[i])) result.append("1 ");
            else result.append("0 ");
        }
        System.out.println(result.toString().trim());
    }
}

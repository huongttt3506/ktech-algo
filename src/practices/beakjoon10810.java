package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/10810
public class beakjoon10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read N and M
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //Create a array to contain baskets status
        int[] baskets = new int[N];

        // Process each command
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st.nextToken()); //start basket
            int j = Integer.parseInt(st.nextToken()); // end basket
            int k = Integer.parseInt(st.nextToken()); // the number on ball

            // put ball k into bakest from i to j
            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }
        }
        // output result: print the number of balls in each basket
        for (int basket : baskets) {
            System.out.print(String.format("%d ", basket));
        }

    }
}

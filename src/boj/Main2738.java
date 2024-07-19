package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2738
public class Main2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] tokens = reader.readLine().split(" ");
//        int n = Integer.parseInt(tokens[0]);
//        int m = Integer.parseInt(tokens[1]);
        int[] tokens = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = tokens[0];
        int m = tokens[1];

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] result = new int[n][m];
        for (int i= 0; i < n; i++) {
            a[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
//            tokens = reader.readLine().split(" ");
//            int[] row = a[i];
//            for (int j = 0; j < m; j++) {
//                row[j] = Integer.parseInt(tokens[j]);
//           }
        }

        for (int i= 0; i < n; i++) {
            b[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
//            tokens = reader.readLine().split(" ");
//            int[] row = b[i];
//            for (int j = 0; j < m; j++) {
//                row[j] = Integer.parseInt(tokens[j]);
//            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(result));
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

    }
}

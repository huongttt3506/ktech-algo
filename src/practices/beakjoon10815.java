package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10815
public class beakjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        //1. Create nArray contains all numbers on N cards
        System.out.println("Input the total number of cards: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Input the numbers on cards: ");
        String lineN = reader.readLine();
        String[] tokensN = lineN.split(" ");
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(tokensN[i]);
        }
        //2.  Create mArray contents m integers
        System.out.println("Input the total number of numbers: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Input all numbers want to test: ");
        String lineM = reader.readLine();
        String[] tokensM = lineM.split(" ");
        int[] mArray = new int[m];

        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(tokensM[i]);
        }
        //3. Test nArray is content element of mArray
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int numberTest = mArray[i];
            answer[i] = Arrays.stream(nArray)
                    .anyMatch(num -> num == numberTest) ? 1 : 0;
        }
        System.out.println(Arrays.toString(answer));
    }
}

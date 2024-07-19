package c1basics;

public class D1TimeComplexity {

    //sum all number from 1 ~ n
    // 총 수행되는 연산: 2 * n + 1
    // n이 커지면 커질수록 더 느려진다.
    public static int sumUntilN1(int n) {
        // 할당 1번
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            // 계산 1번, 할당 1번
            sum += i;
            // * n번
        }
        return sum;
    }

    // 총 수행되는 연산: 3번
    // n이 얼마든 간에 항상 3번의 계산을 한다.
    public static int sumUntilN2(int n) {
        // n + 1: 1번
        // * n:   1번
        // / 2:   1번
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();

    }
}

package practice_programmers;

public class Solution12921 {
    public int solution(int n) {
        int answer = 0;
        int count;
        for (int i = 2; i <= n ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) count++;
            }
            if (count == 2) answer++;
        }
        return answer;
    }
    public int solution1(int n) {
        if (n<2) return 0;
        boolean[] isPrime = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n ; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <=n ; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <=n; i++) {
            if (isPrime[i]) count++;
        }
        return count;

    }
    public int solution2(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int limit = (int)Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;

    }
}

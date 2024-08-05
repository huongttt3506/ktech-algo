package c5brute.d2comb;

public class Combination {
    public static void main(String[] args) {
    }

    public void combination(int n, int r) {

    }

    public void combRecursive(int n, int r, int k, int next, int[] comb) {
        if (k == 0) {

        }
        if (next == n) {
        }

        comb[k] = next;

        combRecursive(n, r, k + 1, next + 1, comb);
        
        combRecursive(n, r, k, next + 1, comb);
    }
}

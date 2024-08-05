package practice_programmers;

public class Solution120808 {
    public static void main(String[] args) {
        Solution120808 sol = new Solution120808();
        System.out.println(sol.gcd(29,6));
        int[] answer = sol.solution(9,2,1,3);
        System.out.println("numer: " + answer[0] + " denom: " + answer[1]);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        int t = gcd(numer, denom);
        numer = numer / t;
        denom = denom / t;
        return new int[] {numer, denom};
    }

    // find the biggest common divisor
    public int gcd(int a, int b) {
        if (a==1 || b==1) return 1;
        if (a==0) return b;
        if (b==0) return a;
        else if (a>b)   return gcd(b, a-b);
        else return gcd(a, b-a);
    }

}

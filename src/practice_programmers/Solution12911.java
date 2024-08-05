package practice_programmers;

public class Solution12911 {
    public static void main(String[] args) {
        Solution12911 prob = new Solution12911();
        System.out.println(prob.solution2(9));
        System.out.println(prob.solution2(2));
        System.out.println(prob.solution2(14));
        System.out.println(prob.solution2(78));
    }

    //시간 초과
    public int solution(int n) {
        //bitCount
        int numOnes = Integer.bitCount(n);
        // Find number > n and bitCount(number) = bitCount(n)
        int nextNum = n + 1;
        while (Integer.bitCount(nextNum) != numOnes) {
            nextNum++;
        }
        return nextNum;
    }
    public int solution2(int n) {
        int bitNum = 32 - Integer.numberOfLeadingZeros(n);
        int[] arr = new int[bitNum+1];
        for (int i=0; i< bitNum+1; i++) {
            arr[i] = (n >> i) & 1;
        }
        int zerosPos = -1;
        for (int i=0; i< bitNum+1; i++) {
            if (((n >> i) & 1) == 0) {
                if (zerosPos < 0) {
                    zerosPos = i;
                }
                else {

                }
            }
        }
        int answer = 0;
        for (int i=0; i<bitNum+1; i++){
            if (arr[i]==1)  answer += (1 << i);
        }
        return answer;
    }
}

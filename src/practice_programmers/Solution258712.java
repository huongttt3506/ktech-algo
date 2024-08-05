package practice_programmers;

class Solution {
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;
        int[][] M = new int[n][n];
        int[] index = new int[n];
        int[] receiveNum = new int[n];

        int l=0, r=0;
        for (String g: gifts) {
            String[] part = g.split(" ");
            for (int i=0; i<n; i++) {
                if (friends[i].equals(part[0]))  {
                    l = i;
                    break;
                }
            }
            for (int i=0; i<n; i++) {
                if (friends[i].equals(part[1]))  {
                    r = i;
                    break;
                }
            }
            M[l][r] += 1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i!=j) {
                    index[i] += M[i][j];
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i!=j) {
                    index[j] -= M[i][j];
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j) continue;
                if ((M[i][j] > M[j][i]) || (M[i][j] == M[j][i] && index[i] > index[j])) {
                    receiveNum[i] += 1;
                }
            }
            if (receiveNum[i] > answer) {
                answer = receiveNum[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int answer = solution(friends, gifts);
        System.out.println("answer = " + answer);
    }
}

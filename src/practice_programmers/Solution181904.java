package practice_programmers;


//https://school.programmers.co.kr/learn/courses/30/lessons/181904
public class Solution181904 {
    public static void main(String[] args) {
        String myStr = "ihrhbakrfpndopljhygc";
        int m = 4;
        int len = myStr.length();
        System.out.println(len % m == 0 ? len / m : len / m + 1);
        System.out.println(solution(myStr, m, 2));
        String str2 = "programmers";
        System.out.println(solution(str2, 1, 1));

    }
    public static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        // option 1: for each element
        for (int i=c-1; i<my_string.length(); i+=m) {
            answer.append(my_string.charAt(i));
        }

//        // define index in while loop
//        int i=c-1;
//        while (i<my_string.length()) {
//            answer.append(my_string.charAt(i));
//            i += m;
//        }
        return answer.toString();
    }


}

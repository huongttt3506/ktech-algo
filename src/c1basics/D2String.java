package c1basics;

public class D2String {
    // aaaaa, bbbbb -> ababababab
    public String solution(String str1, String str2) {
        //StringBuilder
        StringBuilder answer = new StringBuilder();
        //StringBuilder + append
        for (int i = 0; i< str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
    public String solution1(String str1, String str2) {
        // method1: tocharArray() -> convert to char[]
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        String answer = "";
        for (int i = 0; i < chars1.length; i++) {
            answer += chars1[i];
            answer += chars2[i];
        }
        return answer;
    }
    public String solution2(String str1, String str2) {
        // charAt(int i)
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}

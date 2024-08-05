package practice_programmers;

public class Solution120863 {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" + ");
        int constantSum = 0;
        int coefficientSum = 0;
        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {coefficientSum++;}
                else {
                    coefficientSum += Integer.parseInt(term.replace("x", ""));
                }
            }
            else {
                constantSum += Integer.parseInt(term);
            }
        }
        StringBuilder answer = new StringBuilder();
        if (coefficientSum !=  0) {
            answer.append(coefficientSum == 1 ? "x" : coefficientSum + "x");
        }
        if (constantSum !=0) {
            if (answer.length() !=0) answer.append(" + ");
            answer.append(constantSum);
        }
        return answer.toString();
    }
}

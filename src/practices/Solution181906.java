package practices;
//https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Solution181906 {
    public static void main(String[] args) {

    }

    public static int solution1(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) return 0;
        else {
            int count = 0;
            for (int i = 0; i < is_prefix.length(); i++) {
                if(is_prefix.charAt(i) == my_string.charAt(i)) {
                    count++;
                }
            }
            return count == is_prefix.length() ? 1 : 0;
        }
    }
}


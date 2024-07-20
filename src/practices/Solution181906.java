package practices;
//https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Solution181906 {
    public int solution1(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) return 0;
        else {
            int count = 0;
            for (int i = 0; i < is_prefix.length(); i++) {
                if(is_prefix.charAt(i) == my_string.charAt(i)) {
                    count++;
                }
            }
            return count == is_prefix.length() ? 1 : 0;
            // Use the startsWith method to check if my_string starts with is_prefix
            // return my_string.startsWith(is_prefix) ? 1 : 0;
        }
    }
}


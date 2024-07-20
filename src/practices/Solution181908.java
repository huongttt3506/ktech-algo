package practices;

//https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class Solution181908 {
    public int solution(String my_string, String is_suffix) {
        // Reverse my_string
        int length = my_string.length();
        StringBuilder convert_Str = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            convert_Str.append(my_string.charAt(i));
        }
        String newStr = convert_Str.toString();

        // Reverse is_suffix
        int length_suffix = is_suffix.length();
        StringBuilder convert_suffix = new StringBuilder();
        for (int i = length_suffix - 1; i >= 0; i--) {
            convert_suffix.append(is_suffix.charAt(i));
        }
        String newSuffix = convert_suffix.toString();

        // Check if the reversed my_string starts with the reversed is_suffix
        return newStr.startsWith(newSuffix) ? 1 : 0;

        // Use the endsWith method to check if my_string ends with is_suffix
//        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}

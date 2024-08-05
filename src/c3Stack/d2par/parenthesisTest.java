package c3Stack.d2par;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄효 검사
public class parenthesisTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test(reader.readLine()));
    }
    //line이라는 매개변수가 괄호로 으뤄져 있다고 할 때
    //line의 괄호가 정상적으로 매칭이 되는지
    private static boolean test(String line) {
        //java의 stack
        Stack<Character> parStack = new Stack<>();
        //line의 값 글자를 확인한다
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            //만약 글자가 '(' 라면
            //스택에 push 한다
            if (letter == '(') {
                parStack.push(letter);
            }
            //만약 글자가 ')' 라면
            else if (letter == ')') {
                //스택이 비어있다면 false
                //스택에 pop 한다
                if (parStack.isEmpty()) return false;
                char top = parStack.pop();
                if (top != '(') return false;
            }
        }
        // 스택이 비어있으면 true, 아니면 false
        return parStack.isEmpty();
    }

}

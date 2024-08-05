package c3Stack.d1Stack;

import java.util.ArrayList;
import java.util.Arrays;

//int 데이터를 stack의 형태로 관리하는 클레스를 만들어보자
public class MyStack {
    //실재로 내부에 데이터를 저장할 공간
    private  final int[] arr = new int[16];
    //현재 스택의 꼭대기
    private int top = -1;
    //top == 0 이면, arr[0] 에 stack의 마지막으로 들어간 데이터가 존재한다

    //데이터를 넣기 위한 기능
    //push
    public void push(int x) {
        if (top == arr.length - 1) {
            throw new RuntimeException("stack is full");
        }
        top++;
        arr[top] = x;
    }

    //데이터를 가져오기 위한 기능
    //pop
    public int pop() {
        int value = arr[top];
        top--;
        return value;
    }

    //스택이 비어있는 확인 가는
    //isEmpty
    public boolean isEmty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 15;
    }
}

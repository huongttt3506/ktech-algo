package c3Stack.d1Stack;

public class Main {
    public static void main(String[] args) {
        MyStack intStack = new MyStack();
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);

        System.out.println(intStack.isEmty());
        System.out.println(intStack.pop());
        intStack.push(40);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        intStack.push(50);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.isEmty());


    }
}

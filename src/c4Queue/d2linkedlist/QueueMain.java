package c4Queue.d2linkedlist;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {
    public static void main(String[] args) {
        //Java의 stack은 class다
        Stack<Integer> stack = new Stack<>();
        //java 의 Queu는 interface다
        //interface 는 개제화 할 수 없기 때문에
        //linkedList 구현체를 사용한다
        Queue<Integer> queue = new LinkedList<>();
        // enQueue - add, offer
            //add : 넣기를 시도하고, 시ㄹ패할 경우 예외 발생
        queue.add(10);
        queue.add(20);
        queue.add(30);
            //offer : 넣기를 시도하고 실패할 경우 false 반환
        queue.offer(15);
        queue.offer(25);
        queue.offer(35);
        //deQueue - remove, poll
         //remove: 빼기를 시도할 때 실패할 경우 예외가 발생
        System.out.println(queue.remove()); //10
        System.out.println(queue.remove()); //20
        System.out.println(queue.remove()); //30
         //poll: 빼기를 시도할 때 실패할 경우 null 반환
        System.out.println(queue.poll()); //15
        System.out.println(queue.poll()); //25
        System.out.println(queue.poll()); //35

        System.out.println(queue.poll()); //null
//        System.out.println(queue.remove()); //예왜 발생
        System.out.println(queue.isEmpty()); //true

        queue.offer(5);
         //peek - element, peek
            //element: 다음에 나오게 될 원소를 살펴보는 기능
            // 다음 원소를 홧인해 보는데 비어있으면 예외 발생
        System.out.println(queue.element());
             //peek : 다음 원소를 홧인해 보는데 비어있으면 null 반환
        System.out.println(queue.peek());

        // 그 외
        System.out.println(queue.isEmpty()); //false
        System.out.println(queue.size()); // 1

    }
}

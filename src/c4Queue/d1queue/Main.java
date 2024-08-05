package c4Queue.d1queue;

public class Main {
    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        //push 4 data
        intQueue.enQueue(3);
        intQueue.enQueue(5);
        intQueue.enQueue(7);
        intQueue.enQueue(11);
        System.out.print(intQueue.isEmpty());
        //remove 4 data
        System.out.print(intQueue.deQueue());
        System.out.print(intQueue.deQueue());
        System.out.print(intQueue.deQueue());
        // now, intQueue is empty
        System.out.print(intQueue.isEmpty());

        for (int i = 0; i < 12 ; i++) {
            intQueue.enQueue(i);
        }
        System.out.println(intQueue.isFull());
        System.out.println("==================================");
        MyCyclicQueue intCyQueue = new MyCyclicQueue();
        intCyQueue.enQueue(0);
        intCyQueue.enQueue(1);
        intCyQueue.enQueue(2);
        intCyQueue.enQueue(3);
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
        System.out.println("start dequeue");
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
        intCyQueue.enQueue(4);
        intCyQueue.enQueue(5);
        intCyQueue.enQueue(6);
        intCyQueue.enQueue(7);
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());


    }

}

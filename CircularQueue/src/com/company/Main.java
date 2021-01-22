package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1));; // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
             // return 3
        System.out.println(myCircularQueue.Rear());
        myCircularQueue.isFull();   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.Rear();     // return 4
    }
}

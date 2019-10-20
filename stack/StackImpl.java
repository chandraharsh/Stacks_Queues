package stack;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class StackImpl {

    private static int capacity = 0;

    public int getTop() {
        return top;
    }

    public static int top = -1;

    private static int[] stack = null;

    public int getCapacity() {
        return capacity;
    }

    public StackImpl(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
    }


    public static void push(Integer i) {
       // System.out.println("hello1");
        if(top == capacity){
            System.out.println("stack is full");
        }
        else{
            top++;
            stack[top] = i;

        }

    }

    public static Integer pop() {
       // System.out.println("hello2");
        if(top == -1) {
            System.out.println("stack is empty");
            return null;
        }
        else {
            int j;
            j = stack[top--];
            return j;
        }

    }

    public static void main(String[] args) {
        //StackImpl stack = new StackImpl(10);
      //  StackImpl stack1 = new StackImpl(2);
        //stack.push(1);
        //stack.push(2);
        //stack.push(3);
      //  stack1.pop();

    }
}

package queue;

import stack.StackImpl;

public class QueueImplWithStack {

    private static int capacity = 0;



    private static StackImpl stack1 = null;
    private static StackImpl stack2 = null;

    private QueueImplWithStack(int capacity){
        this.capacity = capacity;
        this.stack1 = new StackImpl(1000);
        this.stack2 = new StackImpl(1000);
    }

    public static void addToRear(Integer i){
        if (stack1.top == capacity)
            System.out.println("Queue is full");
        else
            stack1.push(i);
    }

    public static void transfer1( StackImpl stack1, StackImpl stack2) {

        for(int i= stack1.top; i > -1; i--){
            int k = stack1.pop();
            stack2.push(k);
          
        }
    }

   // public static void transfer2() {

     //   while(stack2.top!=-1) {
     //       int j = stack2.pop();
     //       stack1.push(j);
      //  }
   // }

    public static Integer removeFromFront(){
                transfer1(stack1,stack2);
                int l = stack2.pop();
        System.out.println("element" + l);
               // transfer2();
                transfer1(stack2,stack1);
                return l;
            }


        public static void main(String[] args){
        QueueImplWithStack queue = new QueueImplWithStack(10);
        queue.addToRear(1);
        queue.addToRear(2);
        int l = queue.removeFromFront();
        System.out.println("dequeue element" + l);

        }
    }




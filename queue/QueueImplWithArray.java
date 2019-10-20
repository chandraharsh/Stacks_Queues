package queue;

import java.util.Objects;

public class QueueImplWithArray {

    private static int[] arr = null;
    private static int capacity = 0;
    private static int front = 0;
    private static int rear = 0;

    public QueueImplWithArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }


    public static void Add(Integer i) {
        if (rear == capacity)
            System.out.println("Queue is full");
        else {
            arr[rear] = i;
            rear++;
        }
    }

    public static Integer remove() {

        if(rear == front) {
            System.out.println("Queue is empty");
            return null;
        }
        else {
            int k = arr[0];
            for(int j = 0; j<rear; j++){
                arr[j]=arr[j+1];
            }
            rear--;
            return k;
        }
    }

    public static void main (String[] args){
        QueueImplWithArray queue = new QueueImplWithArray(10);
        queue.Add(1);
       // queue.Add(2);
      //  queue.Add(3);
        //int z = queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        //System.out.println("dequeue element"+z);
        //for(int m=0;m<rear;m++)
          //  System.out.println(arr[m]);

    }
}
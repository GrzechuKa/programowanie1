package dataSructures.queue;

public class Queue {

    private int front;
    private int rear;
    private int count;
    int[] queue;

    public Queue(int size) {
        front = -1;
        rear = -1;
        count = 0;
        queue = new int[size];
    }

    public boolean enqueue(int element) {
        if (isEmpty()) {
            front++;
            rear++;
            queue[rear] = element;
            count++;
            return true;
        }
        if (!isEmpty() && !isFull()) {
            if (rear == queue.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = element;
            count++;
            return true;
        }
        return false;
    }

    public int dequeue() throws EmptyQueueExeptionMy {
        if (!isEmpty() && count > 1) {
            int temp = queue[front];
            if(front == queue.length -1){
                front = 0;
            } else {
                front++;
            }
            count--;
            return temp;
        }
        if (!isEmpty() && count == 1){
            int temp = queue[front];
            front = -1;
            rear = -1;
            count--;
            return temp;
        }
            throw new EmptyQueueExeptionMy();
    }

    public int peek() throws EmptyQueueExeptionMy {
        if (!isEmpty()){
            return queue[front];
        }
            throw new EmptyQueueExeptionMy();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

}

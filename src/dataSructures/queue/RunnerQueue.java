package dataSructures.queue;

public class RunnerQueue {

    public static void main(String[] args) {


        Queue queue = new Queue(3);

        System.out.println("Is it empty : " + queue.isEmpty());

        System.out.println(queue.enqueue(5));
        System.out.println(queue.enqueue(7));
        System.out.println(queue.enqueue(9));

        System.out.println("Is it full : " + queue.isFull());



        try{
            System.out.println("Front :" + queue.peek());
            queue.dequeue();
        } catch (EmptyQueueExeptionMy e) {
            e.printStackTrace();
        }
        try{
            System.out.println("Front :" + queue.peek());
            queue.dequeue();
        } catch (EmptyQueueExeptionMy e) {
            e.printStackTrace();
        }
        try{
            System.out.println("Front :" + queue.peek());
            queue.dequeue();
        } catch (EmptyQueueExeptionMy e) {
            e.printStackTrace();
        }
        try{
            System.out.println("Front :" + queue.peek());
            queue.dequeue();
        } catch (EmptyQueueExeptionMy e) {
            e.printStackTrace();
        }


    }
}

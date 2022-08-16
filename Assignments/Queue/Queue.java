package Queue;

//Queue using Array Technique O(N) TLE
class Queue_operations{
    int[] arr = new int[3];
    int front = 0;
    int n = arr.length;
    int rear = -1;
    public void Enqueue(int x){
        if (rear == n-1) {
            throw new RuntimeException("All Array Elements FULL remove elements from Queue");
        }
        rear++;
        arr[rear]=x;
    }
    public void Dequeue(){
        if(rear == -1){
            throw new RuntimeException("All Array Elements Removed Add more into Queue");
        }
        int desired = arr[front];
        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        System.out.println(desired+" ");
    }

}

//Queue Using Array in circular fashion O(1) TLE
class Circular_Queue{
    static int[] arr;
    int front = -1;
    int n ;
    int rear = -1;
    Circular_Queue(int n){
        this.n = n;
        arr = new int[n];
    }
    public void Enqueue(int x){
        if((rear+1)%n == front){
            throw new RuntimeException("text");
        }
        if(front==-1)front=0;
        rear = (rear+1)%n;
        arr[rear]= x;
    }

    public void Dequeue(){
        if(front==-1){
            throw new RuntimeException("Array is Empty");
        }
        int desired = arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front = (front+1)%n;
        }
        System.out.println(desired);
    }
}

public class Queue {
    public static void main(String[] args) {
//        Queue_operations op = new Queue_operations();
//        op.Enqueue(1);
//        op.Enqueue(2);
//        op.Enqueue(3);
//        for(int i =0;i<op.arr.length;i++){
//            System.out.print(op.arr[i]+" ");
//        }
//        System.out.println();
//        op.Dequeue();
//        for(int i =0;i<op.arr.length;i++){
//            System.out.print(op.arr[i]+" ");
//        }
//        op.Enqueue(4);
//        op.Dequeue();
//        op.Dequeue();
//        op.Dequeue();
//        op.Dequeue();
//        Circular_Queue op = new Circular_Queue(4);
//        op.Enqueue(1);
//        op.Enqueue(2);
//        op.Enqueue(3);
//        op.Enqueue(4);
//        for(int i =0;i<op.arr.length;i++){
//            System.out.print(op.arr[i]+" ");
//        }
//        System.out.println();
//        op.Dequeue();
//        op.Dequeue();
//        op.Dequeue();
//        op.Enqueue(5);
//        for(int i =0;i<op.arr.length;i++){
//            System.out.print(op.arr[i]+" ");
//        }
//        System.out.println();
//        op.Dequeue();
//        op.Dequeue();
    }
}

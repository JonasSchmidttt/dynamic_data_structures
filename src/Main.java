import model.quene.Queue;

public class Main {
    public static void main(String[] args) {
        //Stack
        /*
        Stack stack = new Stack();
        stack.push(1);
        stack.push("2");
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println(stack.loop());
        */

        /*
        //Queue
        Queue schlange = new Queue();
        schlange.enqueue(2);
        schlange.enqueue("hallo");
        schlange.enqueue("peter");
        schlange.enqueue("jürgen");
        //schlange.dequeue();
        System.out.println(schlange.loop());
         */

        //Queue Test
        Queue Tschlange = new Queue();
        Tschlange.enqueue(2);
        Tschlange.dequeue();
        Tschlange.enqueue(3);
        System.out.println(Tschlange.loop());
    }
}
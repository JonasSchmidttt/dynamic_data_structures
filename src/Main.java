import model.quene.N_Queue;
import model.stack.Stack;
import model.list.List;
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
        System.out.println(stack.lenght());
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

        //Liste
        /*
        List list = new List();
        list.append(1);

        list.getObject();
        */

        //N_Queue
        N_Queue n_queue = new N_Queue();
        n_queue.enquene(1);
        n_queue.enquene("hallo");
        System.out.println(n_queue.front());
    }
}
import model.Quene.Queue;
import model.node.Node;
import model.stack.Stack;

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

        //Queue
        Queue schlange = new Queue();
        schlange.enqueue(2);
        schlange.enqueue("hallo");
        schlange.enqueue("peter");
        schlange.enqueue("jürgen");
        //schlange.dequeue();
        System.out.println(schlange.loop());

    }
}
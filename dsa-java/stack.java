import java.util.Stack;
public class stack{
    public static void main(String[] args) {

        //stack = LIFO stack data structure, last in first out
        //        stores objects into a sort of "vertical tower"
        //        main operations: push, pop, peek, isEmpty

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop()); // Output: 4
        System.out.println(stack.peek()); // Output: 3
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.search(2)); // Output: 2

        //uses of atck?
        //1.undo/redo features in text editors
        //2.moving back and forth between pages in a web browser
        //3.backtracting algorithms(maze,file directories)
        //4.calling function(cal stack)
    }
}
import java.util.Stack;

public class DSAstack {
    public static void main(String[] args) throws Exception {
  // stack = LIFO data structure. Last-In First-Out
  //               stores objects into a sort of "vertical tower"
  //               push() to add objects to the top
  //               pop() to remove objects from the top
  
  // uses of stacks?
  // 1. undo/redo features in text editors
  // 2. moving back/forward through browser history
  // 3. backtracking algorithms (maze, file directories)
  // 4. calling functions (call stack)

    Stack<String> stack = new Stack<String>();
    // System.out.println(stack.empty());
    
    stack.push("Minecraft");
    stack.push("CSGO");
    stack.push("Valorant");
    stack.push("Apex Legends");
    
    String removed = stack.pop();
        System.out.println(stack);
        System.out.println("Removed: "+ removed);
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));


    }
}

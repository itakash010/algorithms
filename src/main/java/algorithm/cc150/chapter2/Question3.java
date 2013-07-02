package algorithm.cc150.chapter2;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked
 * list, given only access to that node.
 * 
 * 
 * EXAMPLE
 * 
 * Input: the node c from the linked list a ->b ->c ->d ->e
 * 
 * Result: nothing is returned, but the new linked list looks like a ->b ->d ->e
 * 
 */
public class Question3 {

  public static class Node<T> {
    public T elem;
    public Node<T> next;

    public Node(T elem) {
      this.elem = elem;
    }
  }

  public <T> void deleteMiddle(Node<T> head) {
    // write implementation here

  }

}
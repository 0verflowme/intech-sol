class LinkedListNode {
   int data;
   LinkedListNode next;

   public LinkedListNode(int data) {
      this.data = data;
      this.next = null;
   }
}
public class LL {
      // Time Complexity is O(N) where N is length of LL
      public static void nthNodeFromLast(LinkedListNode head, int N) {
         int i = 0;
         if (head == null) {
            return;
         }
         nthNodeFromLast(head.next, N);
         if (++i == N) {
            System.out.println(head.data);
         }
      }
}

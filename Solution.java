import java.util.Stack;
class StackWithMin {
   Stack<Integer> s;
   int min;

   StackWithMin() {
      s = new Stack<Integer>();
   }
   
   void getMin()
   {
       if (s.isEmpty())
           System.out.println(-1);
       else
           System.out.println(min);
   }

   void peek()
   {
       if (s.isEmpty()) {
           System.out.println(-1);
           return;
       }

       int t = s.peek();
   }
   void pop()
   {
       if (s.isEmpty()) {
           System.out.println(-1);
           return;
       }
       Integer t = s.pop();
       if (t < min) {
           min = 2 * min - t;
       }

   }
   void push(Integer x)
   {
       if (s.isEmpty()) {
           min = x;
           s.push(x);
           return;
       }
       if (x < min) {
           s.push(2 * x - min);
           min = x;
       }

       else
           s.push(x);
   }
};

public class Solution {
   class LinkedListNode {
      int data;
      LinkedListNode next;
   
      public LinkedListNode(int data){
         this.data = data;
         this.next = null;
      }
   }
   
   // Time Complexity O(n)
   public static String StringCompression(String str) {
       StringBuffer sb = new StringBuffer();
       int count = 1;
       for (int i = 0; i < str.length(); i++) {
           if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
               count++;
           } else {
               sb.append(str.charAt(i));
               if (count > 1) {
                   sb.append(count);
               }
               count = 1;
           }
       }
       return sb.toString();
   }

   public static String StringDecompression(String str) {
       // Time Complexity O(nx) where x is the max number in the String
       StringBuffer sb = new StringBuffer();
       for (int i = 0; i < str.length(); i += 2) {
           char c = str.charAt(i);
           int times = Integer.parseInt("" + str.charAt(i + 1));
           for (int j = 0; j < times; j++) {
               sb.append(c);
           }
       }
       return sb.toString();
   }

   // Time Complexity is O(N) where N is length of LL
   public static void nthNodeFromLast(LinkedListNode head, int N) {
      int i = 0;
      if (head == null) {
         return;
      }
      nthNodeFromLast(head.next, N);
      if (i+1 == N) {
         System.out.println(head.data);
      }
   }

   public static void main(String[] args) {
       System.out.println(StringCompression("aaaabcccc"));
       System.out.println(StringDecompression("a2b1c5a3"));
   }
}
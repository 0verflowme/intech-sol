import java.util.Stack;

// Stack With Min variable track
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
       System.out.println(t);
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
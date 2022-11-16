
public class Solution {
   
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


   public static int watertrapped(int[] arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
  
        int water = 0;
  
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
  
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];
  
        return water;
    }

   public static void main(String[] args) {
      //  System.out.println(StringCompression("aaaabcccc"));
      //  System.out.println(StringDecompression("a2b1c5a3"));
      int[] arr = { 2, 1, 3,0, 1,2,3};
      System.out.println(watertrapped(arr));
   }
}
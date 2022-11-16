public class Solution {
	public static String getCompressedString(String str) {
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
    public static void main(String[] args) {
        System.out.println(getCompressedString("aabcccccaaa"));
    }
}
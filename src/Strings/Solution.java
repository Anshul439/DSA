class Solution {
    public static void main(String[] args) {
        String s = "microsoft";
        int[] indices = {4, 5, 6, 7, 8, 0, 1, 2, 3};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        int length = s.length();
        char[] ch = new char[length];

        for (int i = 0; i < length; i++) {
            ch[indices[i]] = s.charAt(i);
        }
        builder.append(ch);
        return builder.toString();
    }
}
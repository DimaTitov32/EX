public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("qwerty", "asdfg"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int a = word1.length() > word2.length() ? word1.length() : word2.length();
        String res = "";
        for (int i = 0; i < a; i++) {
            if (i < word1.length())
                res += word1.charAt(i);
            if (i < word2.length())
                res += word2.charAt(i);
        }
        return res;
    }
}

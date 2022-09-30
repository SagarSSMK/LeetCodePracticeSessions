package hashtable;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String test ="aaa";
        String t = "ABC";

       System.out.println( minimumWindow(s,t));

    }

    public static String minimumWindow(String s, String t){
        int[] load = new int[256];
        for (char character : t.toCharArray()) {
            //load ASCII values
            load[character]++;
        }

        int start = 0, end = 0;
        int minStart = 0, minLen = Integer.MAX_VALUE;
        int counter = t.length();

        while (end < s.length()) {
            char endC = s.charAt(end);
            if (load[endC] > 0) counter--;

            load[endC]--;
            end++;

            //When all substring values found in main string
            while (counter == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                }

                char startC = s.charAt(start);
                load[startC]++;
                if (load[startC] > 0) counter++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}

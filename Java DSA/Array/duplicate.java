package Array;

public class duplicate {
    public static boolean[] map = new boolean[26];

    public static void isduplicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar - 'a']) {
            isduplicate(str, idx + 1, newString);
        } else {
            newString += currchar;
            map[currchar - 'a'] = true;
            isduplicate(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabcdegdjj";
        isduplicate(str, 0, "");
    }
}

package Array;

public class moveX {

    public static void moveprint(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

        if (currchar == 'x') {
            count++;
            moveprint(str, idx + 1, count, newString);
        }

        else {
            newString += currchar;
            moveprint(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcdxx";

        moveprint(str, 0, 0, "");

    }
}

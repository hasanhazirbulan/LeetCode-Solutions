import java.util.Arrays;

/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory. */
public class ReverseRecursive {
    public void reverseString(char[] s) {
        reverseRecursive(s, 0, s.length - 1);
    }

    private void reverseRecursive(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseRecursive(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        ReverseRecursive solution = new ReverseRecursive();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        System.out.println(Arrays.toString(input));
    }
}

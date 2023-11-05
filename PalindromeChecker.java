import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Inisialisasi stack dan queue dengan karakter dari string input
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {  // Abaikan karakter non-alphanumeric
                stack.push(c);
                queue.add(c);
            }
        }

        // Membandingkan karakter dari stack dan queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "KATAK";

        boolean result = isPalindrome(input);

        System.out.println(result);
    }
}

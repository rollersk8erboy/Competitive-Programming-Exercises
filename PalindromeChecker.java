import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine().replaceAll(" ", "").toLowerCase();
        String result = isPalindrome(string, 0, string.length() - 1);
        System.out.println(result);
    }

    public static String isPalindrome(String string, Integer x, Integer y) {
        if (x > y) {
            return "YES";
        } else if (string.charAt(x) != string.charAt(y)) {
            return "NO";
        } else {
            return isPalindrome(string, x + 1, y - 1);
        }
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chessboard {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        char x = stringTokenizer.nextToken().charAt(0);
        int y = Integer.parseInt(stringTokenizer.nextToken());
        String result = getColor(x, y);
        System.out.println(result);
    }

    public static String getColor(Character x, Integer y) {
        if ((x + y) % 2 == 0) {
            return "BLACK";
        } else {
            return "WHITE";
        }
    }

}

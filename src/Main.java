import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subStr = sc.nextLine();

        int leftBracket = -1;
        int rightBracket = -1;
        int bracketCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                bracketCount += 1;
                if (leftBracket == -1) {
                    leftBracket = i;
                }
            } else if (str.charAt(i) == ']') {
                bracketCount -= 1;
                if (bracketCount == 0) {
                    rightBracket = i;
                    break;

                }
            }
        }
        StringBuffer buf = new StringBuffer(str);
        buf.replace(leftBracket, rightBracket + 1, subStr);
        System.out.println(buf);
    }
}
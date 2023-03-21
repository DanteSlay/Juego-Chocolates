import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
    public static Scanner in;

    static{
        in = new Scanner(System.in);
    }

    public static String emoji(int num) {
        char[] chocolate = Character.toChars(0x1F36B);
        char[] fresa = Character.toChars(0x1F353);
        char[] robot = Character.toChars(0x1F4BB);
        char[] usuario = Character.toChars(0x1F638);
        String emoji = "";
        if (num == 0) {
            emoji = new String(chocolate);
        } else if (num == 3) {
            emoji = new String(fresa);
        } else if (num == 2) {
            emoji = new String(robot);
        } else if (num == 1) {
            emoji = new String(usuario);
        }
        return emoji;
    }

}

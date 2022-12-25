package src;

public class Task4 {
    public static void main(String... args) {
        int x = 1;
        int y = 2;
        while (x <= 11) {
            while (y <= 11) {
                System.out.println(x * y + "");
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}

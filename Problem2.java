import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        for (int i = 0, num = 1; i < a; i++, num += 2) {
            System.out.print(num);
            if (i < a - 1) System.out.print(", ");
        }
    }
}

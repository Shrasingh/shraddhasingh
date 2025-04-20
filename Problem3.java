import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int count = 0;
        for (int i = 1; count < a; i += 2) {
            System.out.print(i);
            count++;
            if (count < a && (count + 1) / 2 <= a / 2) System.out.print(", ");
        }
    }
}

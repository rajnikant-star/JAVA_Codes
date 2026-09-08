import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {
                a[++j] = a[i];
            }
        }
        System.out.println("Unique count: " + (j + 1));
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


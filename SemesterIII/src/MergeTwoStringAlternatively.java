import java.util.Scanner;

public class MergeTwoStringAlternatively {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder add = new StringBuilder();

        int i = 0, j = 0;

        // merge alternately
        while (i < s1.length() && j < s2.length()) {
            add.append(s1.charAt(i++));
            add.append(s2.charAt(j++));
        }

        // append leftovers
        while (i < s1.length()) {
            add.append(s1.charAt(i++));
        }
        while (j < s2.length()) {
            add.append(s2.charAt(j++));
        }

        System.out.println(add.toString());
    }
}
